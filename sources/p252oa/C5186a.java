package p252oa;

/* renamed from: oa.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C5186a implements p432y9.InterfaceC7139f {

    /* renamed from: b */
    public static final /* synthetic */ p252oa.C5186a f20331b = null;

    /* renamed from: c */
    public static final /* synthetic */ p252oa.C5186a f20332c = null;

    /* renamed from: a */
    public final /* synthetic */ int f20333a;

    static {
            oa.a r0 = new oa.a
            r1 = 0
            r0.<init>(r1)
            p252oa.C5186a.f20331b = r0
            oa.a r0 = new oa.a
            r1 = 1
            r0.<init>(r1)
            p252oa.C5186a.f20332c = r0
            return
    }

    public /* synthetic */ C5186a(int r1) {
            r0 = this;
            r0.f20333a = r1
            r0.<init>()
            return
    }

    @Override // p432y9.InterfaceC7139f
    /* renamed from: a */
    public final java.lang.Object mo3940a(p432y9.InterfaceC7137d r4) {
            r3 = this;
            int r0 = r3.f20333a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            t3.g r4 = com.google.firebase.datatransport.TransportRegistrar.m3648a(r4)
            return r4
        Lb:
            ua.b r0 = new ua.b
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            y9.s r4 = (p432y9.C7152s) r4
            java.lang.Object r1 = r4.mo14246a(r1)
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<ua.c> r2 = ua.InterfaceC6368c.class
            java.util.Set r4 = r4.mo14247b(r2)
            r0.<init>(r1, r4)
            return r0
    }
}
