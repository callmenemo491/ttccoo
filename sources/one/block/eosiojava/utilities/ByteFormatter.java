package one.block.eosiojava.utilities;

/* loaded from: classes.dex */
public class ByteFormatter {
    private static final int BASE64_PADDING = 4;
    private static final char BASE64_PADDING_CHAR = '=';
    private byte[] context;

    public ByteFormatter(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    public static one.block.eosiojava.utilities.ByteFormatter createFromBase64(java.lang.String r7) {
            a9.b$b r0 = new a9.b$b
            r1 = 61
            r0.<init>(r1)
            java.lang.String r7 = r7.toString()
            int r2 = r0.mo37a(r7)
            r3 = 1
            r4 = -1
            if (r2 != r4) goto L14
            goto L25
        L14:
            char[] r7 = r7.toCharArray()
            r4 = 1
        L19:
            int r2 = r2 + r3
        L1a:
            int r5 = r7.length
            if (r2 != r5) goto L59
            java.lang.String r0 = new java.lang.String
            r5 = 0
            int r2 = r2 - r4
            r0.<init>(r7, r5, r2)
            r7 = r0
        L25:
            int r0 = r7.length()
            int r0 = r0 + 4
            int r0 = r0 - r3
            int r0 = r0 / 4
            int r0 = r0 * 4
            int r2 = r7.length()
            if (r2 < r0) goto L37
            goto L4f
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r7)
            int r7 = r7.length()
        L43:
            if (r7 >= r0) goto L4b
            r2.append(r1)
            int r7 = r7 + 1
            goto L43
        L4b:
            java.lang.String r7 = r2.toString()
        L4f:
            one.block.eosiojava.utilities.ByteFormatter r0 = new one.block.eosiojava.utilities.ByteFormatter
            byte[] r7 = p421xj.C7085a.m14188a(r7)
            r0.<init>(r7)
            return r0
        L59:
            char r5 = r7[r2]
            boolean r5 = r0.mo39c(r5)
            if (r5 == 0) goto L64
            int r4 = r4 + 1
            goto L19
        L64:
            int r5 = r2 - r4
            char r6 = r7[r2]
            r7[r5] = r6
            int r2 = r2 + 1
            goto L1a
    }

    public static one.block.eosiojava.utilities.ByteFormatter createFromHex(java.lang.String r1) {
            byte[] r1 = p421xj.C7089e.m14194a(r1)
            one.block.eosiojava.utilities.ByteFormatter r0 = new one.block.eosiojava.utilities.ByteFormatter
            r0.<init>(r1)
            return r0
    }

    public one.block.eosiojava.utilities.ByteFormatter sha256() {
            r2 = this;
            one.block.eosiojava.utilities.ByteFormatter r0 = new one.block.eosiojava.utilities.ByteFormatter
            byte[] r1 = r2.context
            byte[] r1 = org.bitcoinj.core.Sha256Hash.m11640e(r1)
            r0.<init>(r1)
            return r0
    }

    public java.lang.String toHex() {
            r1 = this;
            byte[] r0 = r1.context
            java.lang.String r0 = p421xj.C7089e.m14196c(r0)
            return r0
    }
}
