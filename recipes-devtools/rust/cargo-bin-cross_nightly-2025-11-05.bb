
# Recipe for cargo 20251105
# This corresponds to rust release nightly

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4f9dcb29eab1b16dcf47bbd00cdbc00b",
        "arm-unknown-linux-gnueabi": "d98a8a4e887115dccad45343083a284d",
        "arm-unknown-linux-gnueabihf": "6c666f21713c3a24c7a28935a6008544",
        "armv7-unknown-linux-gnueabihf": "a8d2391ee2fe654a72a28456497ee34f",
        "i686-unknown-linux-gnu": "068b3cadb4cbcd4a801dc0a4ff08cc03",
        "x86_64-unknown-linux-gnu": "3f3b1de4d2c6fe74d3c7e5cebaa5d3c5",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b1a88bfeb2aa577a14d7497ca040aa80cb3ad4b51cba1fedd2f9b2305d60aa6d",
        "arm-unknown-linux-gnueabi": "39060d21c5d10cab7fca0b9053952a2b0fd5cfaaede537575396a71f6b9087d4",
        "arm-unknown-linux-gnueabihf": "697ce45743893f457cf4c1ace7ad48ab9fb69520f25ec166f3d8e89a614c8594",
        "armv7-unknown-linux-gnueabihf": "23c5ed7a9498efbdd5d54a8cb2092dcfa3b41bf0c41e33333d59341779b48762",
        "i686-unknown-linux-gnu": "7f77916e087add2d90a07cc6c0e70db6ebc3de1f80a3e519915f87ed811f4768",
        "x86_64-unknown-linux-gnu": "2d6484388c7ea5b2f0d928190b3b1cf306b5842b797ca6a6221210197ef90020",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-11-05/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-11-05/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-11-05/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-11-05/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-11-05/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-11-05/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= nightly-2025-11-05)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
