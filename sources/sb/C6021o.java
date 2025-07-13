package sb;

/* renamed from: sb.o */
/* loaded from: classes.dex */
public final class C6021o {

    /* renamed from: a */
    public final java.lang.String f23206a;

    /* renamed from: b */
    public final byte[] f23207b;

    /* renamed from: c */
    public sb.C6023q[] f23208c;

    /* renamed from: d */
    public final sb.EnumC6007a f23209d;

    /* renamed from: e */
    public java.util.Map<sb.EnumC6022p, java.lang.Object> f23210e;

    public C6021o(java.lang.String r1, byte[] r2, int r3, sb.C6023q[] r4, sb.EnumC6007a r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.f23206a = r1
            r0.f23207b = r2
            r0.f23208c = r4
            r0.f23209d = r5
            r1 = 0
            r0.f23210e = r1
            return
    }

    public C6021o(java.lang.String r1, byte[] r2, sb.C6023q[] r3, sb.EnumC6007a r4) {
            r0 = this;
            java.lang.System.currentTimeMillis()
            r0.<init>()
            r0.f23206a = r1
            r0.f23207b = r2
            r0.f23208c = r3
            r0.f23209d = r4
            r1 = 0
            r0.f23210e = r1
            return
    }

    /* renamed from: a */
    public void m12499a(java.util.Map<sb.EnumC6022p, java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.Map<sb.p, java.lang.Object> r0 = r1.f23210e
            if (r0 != 0) goto L9
            r1.f23210e = r2
            return
        L9:
            r0.putAll(r2)
        Lc:
            return
    }

    /* renamed from: b */
    public void m12500b(sb.EnumC6022p r3, java.lang.Object r4) {
            r2 = this;
            java.util.Map<sb.p, java.lang.Object> r0 = r2.f23210e
            if (r0 != 0) goto Ld
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<sb.p> r1 = sb.EnumC6022p.class
            r0.<init>(r1)
            r2.f23210e = r0
        Ld:
            java.util.Map<sb.p, java.lang.Object> r0 = r2.f23210e
            r0.put(r3, r4)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f23206a
            return r0
    }
}
