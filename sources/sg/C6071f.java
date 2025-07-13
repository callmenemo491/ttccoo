package sg;

/* renamed from: sg.f */
/* loaded from: classes.dex */
public final class C6071f extends androidx.lifecycle.AbstractC0457n0 {

    /* renamed from: c */
    public final p238nd.C4728b0 f23431c;

    /* renamed from: d */
    public final androidx.lifecycle.C0437d0<java.util.List<java.lang.Object>> f23432d;

    /* renamed from: e */
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.Object>> f23433e;

    /* renamed from: f */
    public final androidx.lifecycle.C0437d0<vg.C6661b<java.lang.Boolean>> f23434f;

    /* renamed from: g */
    public final androidx.lifecycle.C0437d0<vg.C6661b<ch.C0985l>> f23435g;

    /* renamed from: sg.f$a */
    public static final class a {

        /* renamed from: a */
        public final id.C3131b f23436a;

        /* renamed from: b */
        public final boolean f23437b;

        /* renamed from: c */
        public final boolean f23438c;

        public a() {
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 7
                r3.<init>(r0, r1, r1, r2)
                return
        }

        public a(id.C3131b r3, boolean r4, boolean r5, int r6) {
                r2 = this;
                r0 = r6 & 1
                if (r0 == 0) goto L5
                r3 = 0
            L5:
                r0 = r6 & 2
                r1 = 0
                if (r0 == 0) goto Lb
                r4 = 0
            Lb:
                r6 = r6 & 4
                if (r6 == 0) goto L10
                r5 = 0
            L10:
                r2.<init>()
                r2.f23436a = r3
                r2.f23437b = r4
                r2.f23438c = r5
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof sg.C6071f.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                sg.f$a r5 = (sg.C6071f.a) r5
                id.b r1 = r4.f23436a
                id.b r3 = r5.f23436a
                boolean r1 = p214m2.C4339q.m9702c(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                boolean r1 = r4.f23437b
                boolean r3 = r5.f23437b
                if (r1 == r3) goto L1e
                return r2
            L1e:
                boolean r1 = r4.f23438c
                boolean r5 = r5.f23438c
                if (r1 == r5) goto L25
                return r2
            L25:
                return r0
        }

        public int hashCode() {
                r3 = this;
                id.b r0 = r3.f23436a
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                int r0 = r0 * 31
                boolean r1 = r3.f23437b
                r2 = 1
                if (r1 == 0) goto L12
                r1 = 1
            L12:
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r3.f23438c
                if (r1 == 0) goto L1a
                goto L1b
            L1a:
                r2 = r1
            L1b:
                int r0 = r0 + r2
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "AccountItemUI(wallet="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                id.b r1 = r2.f23436a
                r0.append(r1)
                java.lang.String r1 = ", selected="
                r0.append(r1)
                boolean r1 = r2.f23437b
                r0.append(r1)
                java.lang.String r1 = ", rowAdd="
                r0.append(r1)
                boolean r1 = r2.f23438c
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C6071f(p238nd.C4728b0 r2) {
            r1 = this;
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f23431c = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f23432d = r2
            r1.f23433e = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f23434f = r2
            androidx.lifecycle.d0 r2 = new androidx.lifecycle.d0
            r2.<init>()
            r1.f23435g = r2
            return
    }
}
