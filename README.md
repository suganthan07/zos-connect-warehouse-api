# Warehouse Inventory API — IBM z/OS Connect Project

A REST API for warehouse inventory management, designed in **IBM z/OS Connect Designer 3.0**, exposing a CICS-backed COBOL program as modern REST endpoints.

This project demonstrates the bridge between modern API consumers (mobile apps, web frontends) and traditional mainframe business logic — the core value proposition of z/OS Connect in enterprise modernization.

## What's in this repo

| File | Purpose |
|---|---|
| `WarehouseApi.yaml` | Top-level OpenAPI 3.0 specification |
| `src/main/api/openapi.yaml` | z/OS Connect project working copy of the spec |
| `ITEMDET.cpy` | COBOL copybook defining the CICS COMMAREA structure |

## API design

CRUD operations on warehouse inventory items:

- `GET /items` — list all items
- `POST /items` — add a new item
- `GET /items/{itemId}` — retrieve a specific item
- `PUT /items/{itemId}` — replace an item entirely
- `PATCH /items/{itemId}` — partially update an item
- `DELETE /items/{itemId}` — remove an item

### Schemas

- **itemDetails** — full item representation (used for GET, POST, PUT)
- **itemPatch** — partial update schema with no required fields (used for PATCH)
- **ErrorResponse** — consistent error structure across all error responses

### Error handling

Every operation returns appropriate status codes — 200/201/204 for success, 400 for bad input, 404 for missing resources, 500 for server errors. All error responses use a consistent JSON structure.

## Design notes

**Why a separate `itemPatch` schema?**
PATCH semantics require any subset of fields to be valid, while POST/PUT require certain fields. Using a dedicated schema with no required-fields list lets clients send any combination of fields to update, while keeping POST/PUT strict.

**Why omit `itemId` from `itemPatch`?**
The item's ID is already in the URL path. Allowing it in the body would be confusing and risk ID changes via update.

**Mainframe integration**
The included COBOL copybook (`ITEMDET.cpy`) defines the COMMAREA structure for the backing CICS program (ITEMSPG). In a production deployment, the z/OS Connect mapping would translate JSON request fields to copybook fields and back.

## How to run

1. Install Docker Desktop
2. Clone this repo
3. Start z/OS Connect Designer:
    cd zos-connect-warehouse-api
    docker run -it -p 9080:9080 -v ${PWD}:/workspace/project/ icr.io/zosconnect/ibm-zcon-designer:3.0.63
4. Open `http://localhost:9080/zosConnect/designer/` in a browser

## What this project does NOT include

Full end-to-end testing requires a live CICS region and an IPIC connection to a z/OS mainframe, which is enterprise infrastructure. The Designer's "Try it out" feature validates the API spec and exercises the request/response flow up to the point where a real backend would respond.

## Tech / standards used

- OpenAPI 3.0
- IBM z/OS Connect Designer 3.0.63
- COBOL copybook (COMMAREA structure)
- REST API design conventions (resource-oriented URLs, proper HTTP verbs and status codes)

## About

Built as a hands-on learning project to bridge mainframe development experience with modern API integration. Models warehouse inventory operations drawn from prior work on a warehouse management application at Sopra Steria.