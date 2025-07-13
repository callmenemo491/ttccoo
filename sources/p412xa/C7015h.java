package p412xa;

/* renamed from: xa.h */
/* loaded from: classes.dex */
public class C7015h {

    /* renamed from: a */
    public static final byte f27330a = 0;

    /* renamed from: b */
    public static final byte f27331b = 0;

    static {
            java.lang.String r0 = "01110000"
            r1 = 2
            byte r0 = java.lang.Byte.parseByte(r0, r1)
            p412xa.C7015h.f27330a = r0
            java.lang.String r0 = "00001111"
            byte r0 = java.lang.Byte.parseByte(r0, r1)
            p412xa.C7015h.f27331b = r0
            return
    }

    public C7015h() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public java.lang.String m14168a() {
            r4 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r1 = 17
            byte[] r1 = new byte[r1]
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            long r2 = r0.getMostSignificantBits()
            r1.putLong(r2)
            long r2 = r0.getLeastSignificantBits()
            r1.putLong(r2)
            byte[] r0 = r1.array()
            r1 = 16
            r2 = 0
            r3 = r0[r2]
            r0[r1] = r3
            byte r1 = p412xa.C7015h.f27331b
            r3 = r0[r2]
            r1 = r1 & r3
            byte r3 = p412xa.C7015h.f27330a
            r1 = r1 | r3
            byte r1 = (byte) r1
            r0[r2] = r1
            java.lang.String r1 = new java.lang.String
            r3 = 11
            byte[] r0 = android.util.Base64.encode(r0, r3)
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()
            r1.<init>(r0, r3)
            r0 = 22
            java.lang.String r0 = r1.substring(r2, r0)
            return r0
    }
}
