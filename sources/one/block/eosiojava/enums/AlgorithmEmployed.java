package one.block.eosiojava.enums;

/* loaded from: classes.dex */
public enum AlgorithmEmployed extends java.lang.Enum<one.block.eosiojava.enums.AlgorithmEmployed> {
    private static final /* synthetic */ one.block.eosiojava.enums.AlgorithmEmployed[] $VALUES = null;
    public static final one.block.eosiojava.enums.AlgorithmEmployed PRIME256V1 = null;
    public static final one.block.eosiojava.enums.AlgorithmEmployed SECP256K1 = null;
    public static final one.block.eosiojava.enums.AlgorithmEmployed SECP256R1 = null;
    private java.lang.String str;

    static {
            one.block.eosiojava.enums.AlgorithmEmployed r0 = new one.block.eosiojava.enums.AlgorithmEmployed
            java.lang.String r1 = "SECP256R1"
            r2 = 0
            java.lang.String r3 = "secp256r1"
            r0.<init>(r1, r2, r3)
            one.block.eosiojava.enums.AlgorithmEmployed.SECP256R1 = r0
            one.block.eosiojava.enums.AlgorithmEmployed r1 = new one.block.eosiojava.enums.AlgorithmEmployed
            java.lang.String r3 = "SECP256K1"
            r4 = 1
            java.lang.String r5 = "secp256k1"
            r1.<init>(r3, r4, r5)
            one.block.eosiojava.enums.AlgorithmEmployed.SECP256K1 = r1
            one.block.eosiojava.enums.AlgorithmEmployed r3 = new one.block.eosiojava.enums.AlgorithmEmployed
            java.lang.String r5 = "PRIME256V1"
            r6 = 2
            java.lang.String r7 = "prime256v1"
            r3.<init>(r5, r6, r7)
            one.block.eosiojava.enums.AlgorithmEmployed.PRIME256V1 = r3
            r5 = 3
            one.block.eosiojava.enums.AlgorithmEmployed[] r5 = new one.block.eosiojava.enums.AlgorithmEmployed[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            one.block.eosiojava.enums.AlgorithmEmployed.$VALUES = r5
            return
    }

    AlgorithmEmployed(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.str = r3
            return
    }

    public static one.block.eosiojava.enums.AlgorithmEmployed valueOf(java.lang.String r1) {
            java.lang.Class<one.block.eosiojava.enums.AlgorithmEmployed> r0 = one.block.eosiojava.enums.AlgorithmEmployed.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            one.block.eosiojava.enums.AlgorithmEmployed r1 = (one.block.eosiojava.enums.AlgorithmEmployed) r1
            return r1
    }

    public static one.block.eosiojava.enums.AlgorithmEmployed[] values() {
            one.block.eosiojava.enums.AlgorithmEmployed[] r0 = one.block.eosiojava.enums.AlgorithmEmployed.$VALUES
            java.lang.Object r0 = r0.clone()
            one.block.eosiojava.enums.AlgorithmEmployed[] r0 = (one.block.eosiojava.enums.AlgorithmEmployed[]) r0
            return r0
    }

    public java.lang.String getString() {
            r1 = this;
            java.lang.String r0 = r1.str
            return r0
    }
}
