package p184k6;

/* renamed from: k6.e */
/* loaded from: classes.dex */
public class C3702e extends p184k6.C3703f {

    /* renamed from: c */
    public static final java.lang.Object f16404c = null;

    /* renamed from: d */
    public static final p184k6.C3702e f16405d = null;

    @android.annotation.SuppressLint({"HandlerLeak"})
    /* renamed from: k6.e$a */
    public class a extends p053d7.HandlerC1343e {

        /* renamed from: a */
        public final android.content.Context f16406a;

        /* renamed from: b */
        public final /* synthetic */ p184k6.C3702e f16407b;

        public a(p184k6.C3702e r1, android.content.Context r2) {
                r0 = this;
                r0.f16407b = r1
                android.os.Looper r1 = android.os.Looper.myLooper()
                if (r1 != 0) goto Ld
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                goto L11
            Ld:
                android.os.Looper r1 = android.os.Looper.myLooper()
            L11:
                r0.<init>(r1)
                android.content.Context r1 = r2.getApplicationContext()
                r0.f16406a = r1
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r6) {
                r5 = this;
                int r6 = r6.what
                r0 = 1
                if (r6 == r0) goto Lf
                r0 = 50
                java.lang.String r1 = "Don't know how to handle this message: "
                java.lang.String r2 = "GoogleApiAvailability"
                p088f4.C1999d.m5182a(r0, r1, r6, r2)
                goto L47
            Lf:
                k6.e r6 = r5.f16407b
                android.content.Context r1 = r5.f16406a
                int r2 = p184k6.C3703f.f16408a
                int r6 = r6.mo8164b(r1, r2)
                k6.e r1 = r5.f16407b
                java.util.Objects.requireNonNull(r1)
                boolean r1 = p184k6.C3705h.f16411a
                r1 = 0
                if (r6 == r0) goto L2e
                r2 = 2
                if (r6 == r2) goto L2e
                r2 = 3
                if (r6 == r2) goto L2e
                r2 = 9
                if (r6 == r2) goto L2e
                r0 = 0
            L2e:
                if (r0 == 0) goto L47
                k6.e r0 = r5.f16407b
                android.content.Context r2 = r5.f16406a
                java.lang.String r3 = "n"
                android.content.Intent r3 = r0.mo8163a(r2, r6, r3)
                if (r3 != 0) goto L3e
                r1 = 0
                goto L44
            L3e:
                r4 = 134217728(0x8000000, float:3.85186E-34)
                android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r1, r3, r4)
            L44:
                r0.m8166d(r2, r6, r1)
            L47:
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p184k6.C3702e.f16404c = r0
            k6.e r0 = new k6.e
            r0.<init>()
            p184k6.C3702e.f16405d = r0
            return
    }

    public C3702e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p184k6.C3703f
    @androidx.annotation.RecentlyNullable
    /* renamed from: a */
    public android.content.Intent mo8163a(android.content.Context r1, int r2, java.lang.String r3) {
            r0 = this;
            android.content.Intent r1 = super.mo8163a(r1, r2, r3)
            return r1
    }

    @Override // p184k6.C3703f
    /* renamed from: b */
    public int mo8164b(@androidx.annotation.RecentlyNonNull android.content.Context r1, int r2) {
            r0 = this;
            int r1 = super.mo8164b(r1, r2)
            return r1
    }

    /* renamed from: c */
    public boolean m8165c(@androidx.annotation.RecentlyNonNull android.app.Activity r7, int r8, int r9, android.content.DialogInterface.OnCancelListener r10) {
            r6 = this;
            java.lang.String r0 = "d"
            android.content.Intent r0 = super.mo8163a(r7, r8, r0)
            o6.w r1 = new o6.w
            r1.<init>(r0, r7, r9)
            r9 = 0
            r0 = 1
            r2 = 0
            if (r8 != 0) goto L13
            r8 = r2
            goto L96
        L13:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r4 = r7.getTheme()
            r5 = 16843529(0x1010309, float:2.3695736E-38)
            r4.resolveAttribute(r5, r3, r0)
            android.content.res.Resources r4 = r7.getResources()
            int r3 = r3.resourceId
            java.lang.String r3 = r4.getResourceEntryName(r3)
            java.lang.String r4 = "Theme.Dialog.Alert"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3b
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r4 = 5
            r3.<init>(r7, r4)
            goto L3c
        L3b:
            r3 = r2
        L3c:
            if (r3 != 0) goto L43
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r7)
        L43:
            java.lang.String r4 = p248o6.C4938v.m11081e(r7, r8)
            r3.setMessage(r4)
            r3.setOnCancelListener(r10)
            android.content.res.Resources r4 = r7.getResources()
            if (r8 == r0) goto L65
            r5 = 2
            if (r8 == r5) goto L61
            r5 = 3
            if (r8 == r5) goto L5d
            r5 = 17039370(0x104000a, float:2.42446E-38)
            goto L68
        L5d:
            r5 = 2131951723(0x7f13006b, float:1.9539869E38)
            goto L68
        L61:
            r5 = 2131951733(0x7f130075, float:1.9539889E38)
            goto L68
        L65:
            r5 = 2131951726(0x7f13006e, float:1.9539875E38)
        L68:
            java.lang.String r4 = r4.getString(r5)
            if (r4 == 0) goto L71
            r3.setPositiveButton(r4, r1)
        L71:
            java.lang.String r1 = p248o6.C4938v.m11077a(r7, r8)
            if (r1 == 0) goto L7a
            r3.setTitle(r1)
        L7a:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1[r9] = r8
            java.lang.String r8 = "Creating dialog for Google Play services availability issue. ConnectionResult=%s"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            java.lang.String r4 = "GoogleApiAvailability"
            android.util.Log.w(r4, r8, r1)
            android.app.AlertDialog r8 = r3.create()
        L96:
            if (r8 != 0) goto L99
            return r9
        L99:
            java.lang.String r9 = "GooglePlayServicesErrorDialog"
            boolean r1 = r7 instanceof androidx.fragment.app.ActivityC0405s
            if (r1 == 0) goto Lb8
            androidx.fragment.app.s r7 = (androidx.fragment.app.ActivityC0405s) r7
            androidx.fragment.app.d0 r7 = r7.m1354t()
            k6.j r1 = new k6.j
            r1.<init>()
            r8.setOnCancelListener(r2)
            r8.setOnDismissListener(r2)
            r1.f16418k1 = r8
            r1.f16419l1 = r10
            r1.mo1229K0(r7, r9)
            goto Lce
        Lb8:
            android.app.FragmentManager r7 = r7.getFragmentManager()
            k6.c r1 = new k6.c
            r1.<init>()
            r8.setOnCancelListener(r2)
            r8.setOnDismissListener(r2)
            r1.f16398Y = r8
            r1.f16399Z = r10
            r1.show(r7, r9)
        Lce:
            return r0
    }

    @android.annotation.TargetApi(20)
    /* renamed from: d */
    public final void m8166d(android.content.Context r11, int r12, android.app.PendingIntent r13) {
            r10 = this;
            java.lang.String r0 = "GMS core API Availability. ConnectionResult=%s, tag=%s"
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r5 = 0
            r2[r3] = r5
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.String r2 = "GoogleApiAvailability"
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            android.util.Log.w(r2, r0, r6)
            r0 = 18
            if (r12 != r0) goto L2e
            k6.e$a r12 = new k6.e$a
            r12.<init>(r10, r11)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r12.sendEmptyMessageDelayed(r3, r0)
            return
        L2e:
            r0 = 6
            if (r13 != 0) goto L3b
            if (r12 != r0) goto L3a
            java.lang.String r11 = "GoogleApiAvailability"
            java.lang.String r12 = "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."
            android.util.Log.w(r11, r12)
        L3a:
            return
        L3b:
            if (r12 != r0) goto L44
            java.lang.String r2 = "common_google_play_services_resolution_required_title"
            java.lang.String r2 = p248o6.C4938v.m11078b(r11, r2)
            goto L48
        L44:
            java.lang.String r2 = p248o6.C4938v.m11077a(r11, r12)
        L48:
            r6 = 2131951730(0x7f130072, float:1.9539883E38)
            if (r2 != 0) goto L55
            android.content.res.Resources r2 = r11.getResources()
            java.lang.String r2 = r2.getString(r6)
        L55:
            if (r12 == r0) goto L61
            r0 = 19
            if (r12 != r0) goto L5c
            goto L61
        L5c:
            java.lang.String r0 = p248o6.C4938v.m11081e(r11, r12)
            goto L6b
        L61:
            java.lang.String r0 = p248o6.C4938v.m11080d(r11)
            java.lang.String r7 = "common_google_play_services_resolution_required_text"
            java.lang.String r0 = p248o6.C4938v.m11079c(r11, r7, r0)
        L6b:
            android.content.res.Resources r7 = r11.getResources()
            java.lang.String r8 = "notification"
            java.lang.Object r8 = r11.getSystemService(r8)
            java.lang.String r9 = "null reference"
            java.util.Objects.requireNonNull(r8, r9)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            c0.m r9 = new c0.m
            r9.<init>(r11, r5)
            r9.f4476p = r3
            r5 = 16
            r9.m2486e(r5, r3)
            r9.m2485d(r2)
            c0.l r2 = new c0.l
            r2.<init>()
            java.lang.CharSequence r5 = p030c0.C0826m.m2482b(r0)
            r2.f4460b = r5
            c0.n r5 = r9.f4473m
            if (r5 == r2) goto L9f
            r9.f4473m = r2
            r2.m2491f(r9)
        L9f:
            boolean r2 = p353u6.C6342e.m12991a(r11)
            if (r2 == 0) goto Lcf
            android.content.pm.ApplicationInfo r0 = r11.getApplicationInfo()
            int r0 = r0.icon
            android.app.Notification r2 = r9.f4485y
            r2.icon = r0
            r9.f4470j = r1
            boolean r0 = p353u6.C6342e.m12992b(r11)
            if (r0 == 0) goto Lcc
            r0 = 2131230888(0x7f0800a8, float:1.8077841E38)
            r2 = 2131951738(0x7f13007a, float:1.9539899E38)
            java.lang.String r2 = r7.getString(r2)
            java.util.ArrayList<c0.j> r5 = r9.f4462b
            c0.j r6 = new c0.j
            r6.<init>(r0, r2, r13)
            r5.add(r6)
            goto Lef
        Lcc:
            r9.f4467g = r13
            goto Lef
        Lcf:
            r2 = 17301642(0x108008a, float:2.4979642E-38)
            android.app.Notification r5 = r9.f4485y
            r5.icon = r2
            java.lang.String r2 = r7.getString(r6)
            android.app.Notification r5 = r9.f4485y
            java.lang.CharSequence r2 = p030c0.C0826m.m2482b(r2)
            r5.tickerText = r2
            long r5 = java.lang.System.currentTimeMillis()
            android.app.Notification r2 = r9.f4485y
            r2.when = r5
            r9.f4467g = r13
            r9.m2484c(r0)
        Lef:
            boolean r13 = p353u6.C6345h.m12995a()
            if (r13 == 0) goto L132
            boolean r13 = p353u6.C6345h.m12995a()
            com.google.android.gms.common.internal.C1101a.m3105j(r13)
            java.lang.Object r13 = p184k6.C3702e.f16404c
            monitor-enter(r13)
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L12f
            java.lang.String r13 = "com.google.android.gms.availability"
            android.app.NotificationChannel r0 = r8.getNotificationChannel(r13)
            s.h<java.lang.String, java.lang.String> r2 = p248o6.C4938v.f19544a
            android.content.res.Resources r11 = r11.getResources()
            r2 = 2131951729(0x7f130071, float:1.953988E38)
            java.lang.String r11 = r11.getString(r2)
            if (r0 != 0) goto L11c
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            r2 = 4
            r0.<init>(r13, r11, r2)
            goto L129
        L11c:
            java.lang.CharSequence r2 = r0.getName()
            boolean r2 = r11.contentEquals(r2)
            if (r2 != 0) goto L12c
            r0.setName(r11)
        L129:
            r8.createNotificationChannel(r0)
        L12c:
            r9.f4482v = r13
            goto L132
        L12f:
            r11 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L12f
            throw r11
        L132:
            android.app.Notification r11 = r9.m2483a()
            if (r12 == r3) goto L141
            if (r12 == r1) goto L141
            r13 = 3
            if (r12 == r13) goto L141
            r12 = 39789(0x9b6d, float:5.5756E-41)
            goto L148
        L141:
            r12 = 10436(0x28c4, float:1.4624E-41)
            java.util.concurrent.atomic.AtomicBoolean r13 = p184k6.C3705h.f16413c
            r13.set(r4)
        L148:
            r8.notify(r12, r11)
            return
    }
}
