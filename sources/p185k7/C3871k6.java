package p185k7;

/* renamed from: k7.k6 */
/* loaded from: classes.dex */
public final class C3871k6 {

    /* renamed from: a */
    public static final java.nio.charset.Charset f16722a = null;

    /* renamed from: b */
    public static final byte[] f16723b = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p185k7.C3871k6.f16722a = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r0 = new byte[r0]
            p185k7.C3871k6.f16723b = r0
            java.nio.ByteBuffer.wrap(r0)
            return
    }

    /* renamed from: a */
    public static int m8781a(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            return r0
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
            return r0
    }

    /* renamed from: b */
    public static int m8782b(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    /* renamed from: c */
    public static java.lang.Object m8783c(java.lang.Object r1, java.lang.Object r2) {
            k7.f7 r1 = (p185k7.InterfaceC3802f7) r1
            k7.y4 r1 = r1.mo8494a()
            k7.f7 r2 = (p185k7.InterfaceC3802f7) r2
            java.util.Objects.requireNonNull(r1)
            k7.a6 r1 = (p185k7.C3731a6) r1
            MessageType extends k7.d6<MessageType, BuilderType> r0 = r1.f16452Y
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L25
            k7.z4 r2 = (p185k7.AbstractC4064z4) r2
            k7.d6 r2 = (p185k7.AbstractC3773d6) r2
            r1.m8205m(r2)
            k7.d6 r1 = r1.m8202g()
            return r1
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "mergeFrom(MessageLite) can only merge messages of the same type."
            r1.<init>(r2)
            throw r1
    }
}
