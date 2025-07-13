package one.block.eosiojava.models.rpcProvider;

/* loaded from: classes.dex */
public class ContextFreeData {
    private java.util.List<java.lang.String> data;
    private byte[] rawBytes;

    public ContextFreeData(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.setData(r1)
            return
    }

    private java.lang.Integer getByteSizePrefix(int r3) {
            r2 = this;
            r0 = 0
        L1:
            boolean r1 = r2.isLessThan128(r3)
            int r0 = r0 + 1
            if (r1 == 0) goto Le
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        Le:
            int r3 = r2.subtract128(r3)
            goto L1
    }

    private java.lang.Integer getTotalBytes(java.util.List<java.lang.String> r4) {
            r3 = this;
            int r0 = r4.size()
            java.lang.Integer r0 = r3.getByteSizePrefix(r0)
            int r0 = r0.intValue()
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            byte[] r1 = r1.getBytes()
            int r2 = r1.length
            java.lang.Integer r2 = r3.getByteSizePrefix(r2)
            int r2 = r2.intValue()
            int r1 = r1.length
            int r2 = r2 + r1
            int r0 = r0 + r2
            goto L10
        L2d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
    }

    private boolean isLessThan128(int r1) {
            r0 = this;
            int r1 = r1 >>> 7
            if (r1 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    private void pushPrefix(java.nio.ByteBuffer r2, int r3) {
            r1 = this;
        L0:
            boolean r0 = r1.isLessThan128(r3)
            if (r0 == 0) goto Lb
            byte r3 = (byte) r3
            r2.put(r3)
            return
        Lb:
            r0 = r3 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r3 = r1.subtract128(r3)
            goto L0
    }

    private void setBytes(byte[] r1) {
            r0 = this;
            r0.rawBytes = r1
            return
    }

    private void setData(java.util.List<java.lang.String> r4) {
            r3 = this;
            r3.data = r4
            boolean r4 = r3.hasData()
            if (r4 != 0) goto Lf
            r4 = 0
            byte[] r4 = new byte[r4]
            r3.setBytes(r4)
            return
        Lf:
            java.util.List<java.lang.String> r4 = r3.data
            java.lang.Integer r4 = r3.getTotalBytes(r4)
            int r4 = r4.intValue()
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.util.List<java.lang.String> r0 = r3.data
            int r0 = r0.size()
            r3.pushPrefix(r4, r0)
            java.util.List<java.lang.String> r0 = r3.data
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            byte[] r1 = r1.getBytes()
            int r2 = r1.length
            r3.pushPrefix(r4, r2)
            r4.put(r1)
            goto L2c
        L44:
            byte[] r4 = r4.array()
            r3.setBytes(r4)
            return
    }

    private int subtract128(int r1) {
            r0 = this;
            int r1 = r1 >>> 7
            return r1
    }

    public byte[] getBytes() {
            r1 = this;
            byte[] r0 = r1.rawBytes
            return r0
    }

    public java.util.List<java.lang.String> getData() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.data
            return r0
    }

    public java.lang.String getHexed() {
            r1 = this;
            boolean r0 = r1.hasData()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            byte[] r0 = r1.getBytes()
            java.lang.String r0 = p421xj.C7089e.m14196c(r0)
            java.lang.String r0 = r0.toUpperCase()
            return r0
    }

    public java.lang.String getSerialized() {
            r1 = this;
            boolean r0 = r1.hasData()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            byte[] r0 = r1.getBytes()
            byte[] r0 = org.bitcoinj.core.Sha256Hash.m11640e(r0)
            java.lang.String r0 = p421xj.C7089e.m14196c(r0)
            return r0
    }

    public boolean hasData() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.data
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }
}
