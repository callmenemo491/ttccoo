package ie;

/* renamed from: ie.e */
/* loaded from: classes.dex */
public final class C3136e extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final android.app.Application f12569c;

    /* renamed from: d */
    public final p238nd.C4728b0 f12570d;

    /* renamed from: e */
    public final p238nd.C4756k1 f12571e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f12572f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f12573g;

    /* renamed from: h */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f12574h;

    /* renamed from: i */
    public final ch.InterfaceC0977d f12575i;

    /* renamed from: ie.e$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<com.google.firebase.auth.FirebaseAuth> {

        /* renamed from: Z */
        public static final ie.C3136e.a f12576Z = null;

        static {
                ie.e$a r0 = new ie.e$a
                r0.<init>()
                ie.C3136e.a.f12576Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public com.google.firebase.auth.FirebaseAuth mo15e() {
                r2 = this;
                com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance()
                java.lang.String r1 = "FirebaseAuth.getInstance()"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    public C3136e(android.app.Application r2, p238nd.C4728b0 r3, p238nd.C4756k1 r4) {
            r1 = this;
            java.lang.String r0 = "app"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "secretToolManager"
            p214m2.C4339q.m9706k(r4, r0)
            r1.<init>()
            r1.f12569c = r2
            r1.f12570d = r3
            r1.f12571e = r4
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f12572f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f12573g = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f12574h = r2
            ie.e$a r2 = ie.C3136e.a.f12576Z
            ch.d r2 = p185k7.C4038x4.m9096i(r2)
            r1.f12575i = r2
            return
    }
}
