package p145i7;

/* renamed from: i7.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C3095d implements qa.InterfaceC5608e {

    /* renamed from: a */
    public static final qa.InterfaceC5608e f12477a = null;

    static {
            i7.d r0 = new i7.d
            r0.<init>()
            p145i7.C3095d.f12477a = r0
            return
    }

    public C3095d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // qa.InterfaceC5605b
    /* renamed from: a */
    public final void mo5556a(java.lang.Object r3, qa.InterfaceC5609f r4) {
            r2 = this;
            qa.f r4 = (qa.InterfaceC5609f) r4
            qa.e<java.lang.Object> r4 = p145i7.C3096e.f12478d
            qa.c r4 = new qa.c
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "Couldn't find encoder for type "
            if (r0 == 0) goto L1f
            java.lang.String r3 = r1.concat(r3)
            goto L24
        L1f:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L24:
            r4.<init>(r3)
            throw r4
    }
}
