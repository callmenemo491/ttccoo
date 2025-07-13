package gf;

/* renamed from: gf.a */
/* loaded from: classes.dex */
public final class C2338a {

    /* renamed from: gf.a$a */
    public static final class a extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f10621p0;

        public a(java.lang.String r1, java.lang.String r2, gf.C2338a.b<T> r3, gf.C2338a.c r4) {
                r0 = this;
                r0.f10621p0 = r2
                r2 = 1
                r0.<init>(r2, r1, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f10621p0
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: p */
        public java.util.Map<java.lang.String, java.lang.String> mo5806p() {
                r3 = this;
                ch.e r0 = new ch.e
                java.lang.String r1 = "Content-Type"
                java.lang.String r2 = "application/json"
                r0.<init>(r1, r2)
                java.util.Map r0 = p185k7.C4038x4.m9098k(r0)
                return r0
        }
    }

    /* renamed from: gf.a$b */
    public static final class b<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<p151if.C3139b> f10622a;

        public b(p101fh.InterfaceC2172d<? super p151if.C3139b> r1) {
                r0 = this;
                r0.f10622a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r4) {
                r3 = this;
                java.lang.String r4 = (java.lang.String) r4
                fh.d<if.b> r0 = r3.f10622a
                java.lang.String r1 = "response"
                jb.j r1 = p238nd.C4754k.m10827a(r4, r1)
                gf.b r2 = new gf.b
                r2.<init>()
                java.lang.reflect.Type r2 = r2.f21382b
                java.lang.Object r4 = r1.m7929c(r4, r2)
                r0.mo5707k(r4)
                return
        }
    }

    /* renamed from: gf.a$c */
    public static final class c implements p105g2.C2222p.a {

        /* renamed from: a */
        public final /* synthetic */ p101fh.InterfaceC2172d<p151if.C3139b> f10623a;

        public c(p101fh.InterfaceC2172d<? super p151if.C3139b> r1) {
                r0 = this;
                r0.f10623a = r1
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.a
        /* renamed from: a */
        public final void mo118a(p105g2.C2226t r3) {
                r2 = this;
                fh.d<if.b> r0 = r2.f10623a
                java.lang.String r1 = "it"
                p214m2.C4339q.m9705j(r3, r1)
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
                return
        }
    }

    /* renamed from: a */
    public static final java.lang.Object m6092a(p105g2.C2221o r3, java.lang.String r4, java.lang.String r5, p101fh.InterfaceC2172d<? super p151if.C3139b> r6) {
            fh.j r0 = new fh.j
            fh.d r6 = gh.C2390b.m6127q(r6)
            r0.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "\n            {\n                \"email\": \""
            r6.append(r1)
            r6.append(r4)
            java.lang.String r4 = "\",\n                \"password\": \""
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = "\"\n            }"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = p362uh.C6459e.m13046C(r4)
            gf.a$b r5 = new gf.a$b
            r5.<init>(r0)
            gf.a$c r6 = new gf.a$c
            r6.<init>(r0)
            gf.a$a r1 = new gf.a$a
            java.lang.String r2 = "https://api.mars.cards/api/auth/sign-in"
            r1.<init>(r2, r4, r5, r6)
            r3.m5814a(r1)
            java.lang.Object r3 = r0.m5741a()
            return r3
    }
}
