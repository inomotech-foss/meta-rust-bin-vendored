
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "dfc4f3c5a3c0f79805009b63aeda7798",
        "aarch64-unknown-linux-musl": "8c5791b3d1d1357cfccb62866da73fa5",
        "arm-unknown-linux-gnueabi": "1c1ab7e3b1913f63fb1cbd23ca1b52ee",
        "arm-unknown-linux-gnueabihf": "5a7cfdd627163f5e2a93adbd825c3fb1",
        "armv5te-unknown-linux-gnueabi": "1e86cef17b89e7d6e3349ebe9ba8c8b5",
        "armv5te-unknown-linux-musleabi": "2df3bc924cf731b7a7a21c73bc9716b5",
        "armv7-unknown-linux-gnueabihf": "8233ce3ada99066c43a5e584ff4965e2",
        "armv7-unknown-linux-musleabihf": "234d89224b34f536a0933036fe1159a9",
        "i686-unknown-linux-gnu": "be70dafece6374b13120e6a953cfdd0b",
        "powerpc-unknown-linux-gnu": "6f03996d425beac10568e439b88232c0",
        "x86_64-unknown-linux-gnu": "bab18508563d169b485e5647404d91c6",
        "riscv64gc-unknown-linux-gnu": "9607b4f57046c08a1dec5884e5da5bad",
        "thumbv7neon-unknown-linux-gnueabihf": "1dda3e7922b357af67be739831d8b6b1",
        "wasm32-unknown-unknown": "7b2b5d4927e98fcfab7bbb399ffc64b1",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2be31c45071518774bc907ee00aa99fe498c28c931e8e79c8fae199c663312f9",
        "aarch64-unknown-linux-musl": "e165e92a68c271c221bf7e5ccb9f6ab8813211c9eadb7fd62d92835b7666fbda",
        "arm-unknown-linux-gnueabi": "975d6e5e50a589a33a4d438a4e96e54690cfffed85965704a1ae0fee7180a362",
        "arm-unknown-linux-gnueabihf": "211788bcbf925c14defcb635768a22065a5e73f21b975776266899cd2c603dab",
        "armv5te-unknown-linux-gnueabi": "9a63bc26ec625c54d4435b20398f5324e4bcf6cdafb14127ca928c0d1385c896",
        "armv5te-unknown-linux-musleabi": "c54100605a21034d09599c9e370e8430f29e08d524125c8fea02075a89663fbf",
        "armv7-unknown-linux-gnueabihf": "3362b1e54cd6061e1683db37da5d7a3b75f9a380023037ec545a2d512a5de59c",
        "armv7-unknown-linux-musleabihf": "717519ae9e45654825e1e5e9a0ee031a6011b6575ede4c27c0e582d7638fe705",
        "i686-unknown-linux-gnu": "5c79f853da3b2fc1bca824e2dd58ec1bab718df0d66cb4ab0924f84dacad20f9",
        "powerpc-unknown-linux-gnu": "f31a8ed0deb0968b3c8d28c827448e1696d368eb67cb876b132cbc3b10c1032d",
        "x86_64-unknown-linux-gnu": "131706e0ec7d8d6cf20228ca93c6cc9ac777db810f5aca15b420989793a10e88",
        "riscv64gc-unknown-linux-gnu": "6e9fd836e4c51d21d3b8ee057fe62be2a0c0893f647b577d8d495af1a5aa8e43",
        "thumbv7neon-unknown-linux-gnueabihf": "91598cc4834d48f5ec28b551094b181bc021c82c2dade92bb511b49cbcd68e8e",
        "wasm32-unknown-unknown": "0b1f2facba8d34d27b0e67da686b40185e8d57a67fd771741c14037f08d547a4",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "002dfc39ce1d6785a2e96be4ac1f2718",
        "arm-unknown-linux-gnueabi": "38bedcf5798b45b968e7a108e3a62ab1",
        "arm-unknown-linux-gnueabihf": "bed55e13c75de0c9de9ba7fdaf34a195",
        "armv7-unknown-linux-gnueabihf": "56991092f5841a7607b6bbefe58352dc",
        "i686-unknown-linux-gnu": "8cb476b063bc65126c4649937d06d2fa",
        "x86_64-unknown-linux-gnu": "b369fa86919ca9542437af3b6129cdfa",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a2e587cff3bdd7264096b4aaaf86919b2876c3543c969b88335e792bc03ba8fa",
        "arm-unknown-linux-gnueabi": "e7197db29e3d8a703388f9636626e8596efc1409ee6f5a2d5eb86b998be3e82a",
        "arm-unknown-linux-gnueabihf": "4c593c939bdb1689226cf9b0ad19fc650b3475e624e5ede8f69d3b05396530af",
        "armv7-unknown-linux-gnueabihf": "aba5bd6092c162f6f3252a3a3fe460a50696da2eafb17b480416ba2e904cea3e",
        "i686-unknown-linux-gnu": "44f2c62ad2d40e6640a6d681ec526381dd260d3f34bb2613b12b8a3a31d08af9",
        "x86_64-unknown-linux-gnu": "895a9c783736d7cc4404ef9e5577f1b015075cc77f08fb019e0d1a2b736a6995",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
