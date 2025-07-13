package p072e7;

/* renamed from: e7.g6 */
/* loaded from: classes.dex */
public final class C1619g6 {

    /* renamed from: a */
    public static final java.nio.charset.Charset f7568a = null;

    /* renamed from: b */
    public static final byte[] f7569b = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p072e7.C1619g6.f7568a = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r0 = new byte[r0]
            p072e7.C1619g6.f7569b = r0
            java.nio.ByteBuffer.wrap(r0)
            return
    }

    /* renamed from: a */
    public static int m4201a(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    /* renamed from: b */
    public static java.lang.Object m4202b(java.lang.Object r1, java.lang.Object r2) {
            e7.a7 r1 = (p072e7.InterfaceC1560a7) r1
            e7.z4 r1 = r1.mo4124u()
            e7.a7 r2 = (p072e7.InterfaceC1560a7) r2
            java.util.Objects.requireNonNull(r1)
            e7.v5 r1 = (p072e7.C1765v5) r1
            MessageType extends e7.x5<MessageType, BuilderType> r0 = r1.f7815Y
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L25
            e7.a5 r2 = (p072e7.AbstractC1558a5) r2
            e7.x5 r2 = (p072e7.AbstractC1783x5) r2
            r1.m4458b(r2)
            e7.x5 r1 = r1.m4460d()
            return r1
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "mergeFrom(MessageLite) can only merge messages of the same type."
            r1.<init>(r2)
            throw r1
    }
}
