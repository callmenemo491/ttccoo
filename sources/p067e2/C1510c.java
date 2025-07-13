package p067e2;

/* renamed from: e2.c */
/* loaded from: classes.dex */
public final class C1510c {

    /* renamed from: a */
    public final java.util.Map<java.lang.Integer, java.lang.Integer> f7343a;

    /* renamed from: b */
    public java.util.Map<java.lang.Integer, p003a2.InterfaceC0004a<?, ?>> f7344b;

    /* renamed from: c */
    public java.util.Map<java.lang.String, java.lang.Integer> f7345c;

    public C1510c(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L1c
            r1.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f7343a = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f7344b = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f7345c = r2
            return
        L1c:
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f7343a = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f7344b = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f7345c = r2
            return
    }

    /* renamed from: a */
    public p003a2.InterfaceC0004a<?, ?> m4099a(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.f7345c
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L13
            int r2 = r0.intValue()
            a2.a r2 = r1.m4100b(r2)
            return r2
        L13:
            java.lang.String r0 = "Didn't find item type for class "
            java.lang.String r2 = p064e.C1493g.m4049a(r0, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: b */
    public p003a2.InterfaceC0004a<?, ?> m4100b(int r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, a2.a<?, ?>> r0 = r2.f7344b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            a2.a r0 = (p003a2.InterfaceC0004a) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = "Didn't find any definitions for type "
            java.lang.String r3 = android.support.v4.media.C0142a.m254a(r0, r3)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: c */
    public int m4101c(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.f7345c
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto Lf
            int r2 = r2.intValue()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    /* renamed from: d */
    public p067e2.C1510c m4102d(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.f7343a
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, a2.a<?, ?>> r0 = r1.f7344b
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.f7345c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r2, r4)
            return r1
    }
}
