package p282q2;

/* renamed from: q2.j */
/* loaded from: classes.dex */
public final class C5553j implements p282q2.InterfaceC5556m<android.net.Uri, java.io.File> {

    /* renamed from: a */
    public final android.content.Context f21614a;

    /* renamed from: q2.j$a */
    public static final class a implements p282q2.InterfaceC5557n<android.net.Uri, java.io.File> {

        /* renamed from: a */
        public final android.content.Context f21615a;

        public a(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.f21615a = r1
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<android.net.Uri, java.io.File> mo9584b(p282q2.C5560q r2) {
                r1 = this;
                q2.j r2 = new q2.j
                android.content.Context r0 = r1.f21615a
                r2.<init>(r0)
                return r2
        }
    }

    /* renamed from: q2.j$b */
    public static class b implements com.bumptech.glide.load.data.InterfaceC1016d<java.io.File> {

        /* renamed from: a0 */
        public static final java.lang.String[] f21616a0 = null;

        /* renamed from: Y */
        public final android.content.Context f21617Y;

        /* renamed from: Z */
        public final android.net.Uri f21618Z;

        static {
                java.lang.String r0 = "_data"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                p282q2.C5553j.b.f21616a0 = r0
                return
        }

        public b(android.content.Context r1, android.net.Uri r2) {
                r0 = this;
                r0.<init>()
                r0.f21617Y = r1
                r0.f21618Z = r2
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: a */
        public java.lang.Class<java.io.File> mo2786a() {
                r1 = this;
                java.lang.Class<java.io.File> r0 = java.io.File.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: b */
        public void mo2789b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        public void cancel() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: e */
        public com.bumptech.glide.load.EnumC1008a mo2792e() {
                r1 = this;
                com.bumptech.glide.load.a r0 = com.bumptech.glide.load.EnumC1008a.f5180Y
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: f */
        public void mo2793f(com.bumptech.glide.EnumC1003g r7, com.bumptech.glide.load.data.InterfaceC1016d.a<? super java.io.File> r8) {
                r6 = this;
                android.content.Context r7 = r6.f21617Y
                android.content.ContentResolver r0 = r7.getContentResolver()
                android.net.Uri r1 = r6.f21618Z
                java.lang.String[] r2 = p282q2.C5553j.b.f21616a0
                r3 = 0
                r4 = 0
                r5 = 0
                android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
                r0 = 0
                if (r7 == 0) goto L2d
                boolean r1 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L28
                if (r1 == 0) goto L24
                java.lang.String r0 = "_data"
                int r0 = r7.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L28
                java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L28
            L24:
                r7.close()
                goto L2d
            L28:
                r8 = move-exception
                r7.close()
                throw r8
            L2d:
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                if (r7 == 0) goto L4b
                java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
                java.lang.String r0 = "Failed to find file path for: "
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                android.net.Uri r1 = r6.f21618Z
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                r8.mo2794c(r7)
                goto L53
            L4b:
                java.io.File r7 = new java.io.File
                r7.<init>(r0)
                r8.mo2795d(r7)
            L53:
                return
        }
    }

    public C5553j(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f21614a = r1
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<java.io.File> mo9582a(android.net.Uri r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            android.net.Uri r2 = (android.net.Uri) r2
            q2.m$a r3 = new q2.m$a
            f3.b r4 = new f3.b
            r4.<init>(r2)
            q2.j$b r5 = new q2.j$b
            android.content.Context r0 = r1.f21614a
            r5.<init>(r0, r2)
            r3.<init>(r4, r5)
            return r3
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public boolean mo9583b(android.net.Uri r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = p064e.C1492f.m4045e(r1)
            return r1
    }
}
