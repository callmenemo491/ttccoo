package com.journeyapps.barcodescanner;

/* renamed from: com.journeyapps.barcodescanner.b */
/* loaded from: classes.dex */
public class C1254b {

    /* renamed from: o */
    public static final /* synthetic */ int f6715o = 0;

    /* renamed from: a */
    public android.app.Activity f6716a;

    /* renamed from: b */
    public com.journeyapps.barcodescanner.DecoratedBarcodeView f6717b;

    /* renamed from: c */
    public int f6718c;

    /* renamed from: d */
    public boolean f6719d;

    /* renamed from: e */
    public boolean f6720e;

    /* renamed from: f */
    public java.lang.String f6721f;

    /* renamed from: g */
    public boolean f6722g;

    /* renamed from: h */
    public p413xb.C7024g f6723h;

    /* renamed from: i */
    public p413xb.C7021d f6724i;

    /* renamed from: j */
    public android.os.Handler f6725j;

    /* renamed from: k */
    public boolean f6726k;

    /* renamed from: l */
    public p454zc.InterfaceC7278b f6727l;

    /* renamed from: m */
    public final com.journeyapps.barcodescanner.C1253a.e f6728m;

    /* renamed from: n */
    public boolean f6729n;

    /* renamed from: com.journeyapps.barcodescanner.b$a */
    public class a implements p454zc.InterfaceC7278b {

        /* renamed from: Y */
        public final /* synthetic */ com.journeyapps.barcodescanner.C1254b f6730Y;

        public a(com.journeyapps.barcodescanner.C1254b r1) {
                r0 = this;
                r0.f6730Y = r1
                r0.<init>()
                return
        }

        @Override // p454zc.InterfaceC7278b
        /* renamed from: a */
        public void mo2673a(p454zc.C7279c r3) {
                r2 = this;
                com.journeyapps.barcodescanner.b r0 = r2.f6730Y
                com.journeyapps.barcodescanner.DecoratedBarcodeView r0 = r0.f6717b
                com.journeyapps.barcodescanner.BarcodeView r0 = r0.f6665a0
                r0.mo3683c()
                com.journeyapps.barcodescanner.b r0 = r2.f6730Y
                xb.d r0 = r0.f6724i
                monitor-enter(r0)
                boolean r1 = r0.f27344b     // Catch: java.lang.Throwable -> L23
                if (r1 == 0) goto L15
                r0.m14173a()     // Catch: java.lang.Throwable -> L23
            L15:
                monitor-exit(r0)
                com.journeyapps.barcodescanner.b r0 = r2.f6730Y
                android.os.Handler r0 = r0.f6725j
                a4.c r1 = new a4.c
                r1.<init>(r2, r3)
                r0.post(r1)
                return
            L23:
                r3 = move-exception
                monitor-exit(r0)
                throw r3
        }

        @Override // p454zc.InterfaceC7278b
        /* renamed from: b */
        public void mo2674b(java.util.List<sb.C6023q> r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.b$b */
    public class b implements com.journeyapps.barcodescanner.C1253a.e {

        /* renamed from: a */
        public final /* synthetic */ com.journeyapps.barcodescanner.C1254b f6731a;

        public b(com.journeyapps.barcodescanner.C1254b r1) {
                r0 = this;
                r0.f6731a = r1
                r0.<init>()
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: a */
        public void mo3692a() {
                r0 = this;
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: b */
        public void mo3693b(java.lang.Exception r3) {
                r2 = this;
                com.journeyapps.barcodescanner.b r3 = r2.f6731a
                android.app.Activity r0 = r3.f6716a
                r1 = 2131952019(0x7f130193, float:1.9540469E38)
                java.lang.String r0 = r0.getString(r1)
                r3.m3703b(r0)
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: c */
        public void mo3694c() {
                r0 = this;
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: d */
        public void mo3695d() {
                r0 = this;
                return
        }

        @Override // com.journeyapps.barcodescanner.C1253a.e
        /* renamed from: e */
        public void mo3696e() {
                r2 = this;
                com.journeyapps.barcodescanner.b r0 = r2.f6731a
                boolean r0 = r0.f6726k
                if (r0 == 0) goto L16
                int r0 = com.journeyapps.barcodescanner.C1254b.f6715o
                java.lang.String r0 = "b"
                java.lang.String r1 = "Camera closed; finishing activity"
                android.util.Log.d(r0, r1)
                com.journeyapps.barcodescanner.b r0 = r2.f6731a
                android.app.Activity r0 = r0.f6716a
                r0.finish()
            L16:
                return
        }
    }

    public C1254b(android.app.Activity r4, com.journeyapps.barcodescanner.DecoratedBarcodeView r5) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.f6718c = r0
            r0 = 0
            r3.f6719d = r0
            r1 = 1
            r3.f6720e = r1
            java.lang.String r2 = ""
            r3.f6721f = r2
            r3.f6722g = r0
            r3.f6726k = r0
            com.journeyapps.barcodescanner.b$a r2 = new com.journeyapps.barcodescanner.b$a
            r2.<init>(r3)
            r3.f6727l = r2
            com.journeyapps.barcodescanner.b$b r2 = new com.journeyapps.barcodescanner.b$b
            r2.<init>(r3)
            r3.f6728m = r2
            r3.f6729n = r0
            r3.f6716a = r4
            r3.f6717b = r5
            com.journeyapps.barcodescanner.BarcodeView r5 = r5.getBarcodeView()
            java.util.List<com.journeyapps.barcodescanner.a$e> r5 = r5.f6694j0
            r5.add(r2)
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            r3.f6725j = r5
            xb.g r5 = new xb.g
            zc.g r0 = new zc.g
            r0.<init>(r3, r1)
            r5.<init>(r4, r0)
            r3.f6723h = r5
            xb.d r5 = new xb.d
            r5.<init>(r4)
            r3.f6724i = r5
            return
    }

    /* renamed from: a */
    public void m3702a() {
            r2 = this;
            com.journeyapps.barcodescanner.DecoratedBarcodeView r0 = r2.f6717b
            com.journeyapps.barcodescanner.BarcodeView r0 = r0.getBarcodeView()
            ad.d r0 = r0.f6685a0
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.f168g
            if (r0 == 0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            if (r0 == 0) goto L1b
            android.app.Activity r0 = r2.f6716a
            r0.finish()
            goto L1d
        L1b:
            r2.f6726k = r1
        L1d:
            com.journeyapps.barcodescanner.DecoratedBarcodeView r0 = r2.f6717b
            com.journeyapps.barcodescanner.BarcodeView r0 = r0.f6665a0
            r0.mo3683c()
            xb.g r0 = r2.f6723h
            r0.m14174a()
            return
    }

    /* renamed from: b */
    public void m3703b(java.lang.String r4) {
            r3 = this;
            android.app.Activity r0 = r3.f6716a
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L4c
            boolean r0 = r3.f6722g
            if (r0 != 0) goto L4c
            boolean r0 = r3.f6726k
            if (r0 == 0) goto L11
            goto L4c
        L11:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L20
            android.app.Activity r4 = r3.f6716a
            r0 = 2131952019(0x7f130193, float:1.9540469E38)
            java.lang.String r4 = r4.getString(r0)
        L20:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.app.Activity r1 = r3.f6716a
            r0.<init>(r1)
            android.app.Activity r1 = r3.f6716a
            r2 = 2131952017(0x7f130191, float:1.9540465E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            r0.setMessage(r4)
            r4 = 2131952018(0x7f130192, float:1.9540467E38)
            zc.f r1 = new zc.f
            r1.<init>(r3)
            r0.setPositiveButton(r4, r1)
            zc.e r4 = new zc.e
            r4.<init>(r3)
            r0.setOnCancelListener(r4)
            r0.show()
        L4c:
            return
    }
}
