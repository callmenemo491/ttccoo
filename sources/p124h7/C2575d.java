package p124h7;

/* renamed from: h7.d */
/* loaded from: classes.dex */
public final class C2575d {

    /* renamed from: a */
    public static final java.nio.charset.Charset f11429a = null;

    /* renamed from: b */
    public static final byte[] f11430b = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p124h7.C2575d.f11429a = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r0 = new byte[r0]
            p124h7.C2575d.f11430b = r0
            java.nio.ByteBuffer.wrap(r0)
            return
    }

    /* renamed from: a */
    public static int m6538a(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            return r0
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
            return r0
    }

    /* renamed from: b */
    public static int m6539b(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    /* renamed from: c */
    public static java.lang.Object m6540c(java.lang.Object r1, java.lang.Object r2) {
            h7.x r1 = (p124h7.InterfaceC2935x) r1
            h7.rf r1 = r1.mo7245q()
            h7.x r2 = (p124h7.InterfaceC2935x) r2
            java.util.Objects.requireNonNull(r1)
            h7.vg r1 = (p124h7.C2916vg) r1
            MessageType extends h7.yg<MessageType, BuilderType> r0 = r1.f11972Y
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L25
            h7.sf r2 = (p124h7.AbstractC2861sf) r2
            h7.yg r2 = (p124h7.AbstractC2970yg) r2
            r1.m7219a(r2)
            h7.yg r1 = r1.m7221c()
            return r1
        L25:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "mergeFrom(MessageLite) can only merge messages of the same type."
            r1.<init>(r2)
            throw r1
    }
}
