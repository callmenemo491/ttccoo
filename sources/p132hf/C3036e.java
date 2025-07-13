package p132hf;

/* renamed from: hf.e */
/* loaded from: classes.dex */
public final class C3036e extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4753j1 f12232c;

    /* renamed from: d */
    public final ch.InterfaceC0977d f12233d;

    /* renamed from: e */
    public final androidx.lifecycle.C0437d0<java.lang.Boolean> f12234e;

    /* renamed from: f */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f12235f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<java.lang.String> f12236g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<java.lang.String> f12237h;

    /* renamed from: i */
    public final androidx.lifecycle.LiveData<java.lang.Boolean> f12238i;

    /* renamed from: j */
    public final androidx.lifecycle.C0437d0<vg.C6661b<p013ah.C0100a>> f12239j;

    /* renamed from: k */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.String>> f12240k;

    /* renamed from: hf.e$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p105g2.C2221o> {

        /* renamed from: Z */
        public final /* synthetic */ android.app.Application f12241Z;

        public a(android.app.Application r1) {
                r0 = this;
                r0.f12241Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p105g2.C2221o mo15e() {
                r1 = this;
                android.app.Application r0 = r1.f12241Z
                g2.o r0 = p119h2.C2450l.m6226a(r0)
                return r0
        }
    }

    public C3036e(android.app.Application r2, p238nd.C4753j1 r3) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "preferenceStorage"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.f12232c = r3
            hf.e$a r3 = new hf.e$a
            r3.<init>(r2)
            ch.d r2 = p185k7.C4038x4.m9096i(r3)
            r1.f12233d = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f12234e = r2
            r1.f12235f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f12236g = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f12237h = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.<init>(r3)
            r1.f12238i = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f12239j = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f12240k = r2
            return
    }
}
