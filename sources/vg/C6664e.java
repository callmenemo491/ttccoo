package vg;

/* renamed from: vg.e */
/* loaded from: classes.dex */
public final class C6664e {

    /* renamed from: a */
    public static long f25908a;

    /* renamed from: a */
    public static final void m13500a(androidx.recyclerview.widget.RecyclerView r5) {
            vg.t r0 = new vg.t
            android.content.Context r1 = r5.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "context.applicationContext"
            p214m2.C4339q.m9705j(r1, r2)
            r2 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r3 = 0
            r4 = 4
            r0.<init>(r1, r2, r3, r4)
            r5.m1754g(r0)
            return
    }

    /* renamed from: b */
    public static final int m13501b(int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r1 = (int) r1
            return r1
    }

    /* renamed from: c */
    public static final java.util.Calendar m13502c(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = 0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L25
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L25
            r1.<init>(r4, r2)     // Catch: java.lang.Exception -> L25
            java.lang.String r4 = "UTC"
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r4)     // Catch: java.lang.Exception -> L25
            r1.setTimeZone(r4)     // Catch: java.lang.Exception -> L25
            java.util.Date r3 = r1.parse(r3)     // Catch: java.lang.Exception -> L25
            if (r3 != 0) goto L1d
            return r0
        L1d:
            java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L25
            r4.setTime(r3)     // Catch: java.lang.Exception -> L25
            return r4
        L25:
            return r0
    }

    /* renamed from: d */
    public static int m13503d(androidx.fragment.app.ComponentCallbacksC0395n r0, int r1, int r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            androidx.fragment.app.s r0 = r0.m1333s()
            if (r0 == 0) goto Lf
            int r2 = p046d0.C1259a.m3706b(r0, r1)
        Lf:
            return r2
    }

    /* renamed from: e */
    public static java.lang.String m13504e(java.util.Calendar r0, java.lang.String r1, java.util.Locale r2, int r3) {
            r2 = r3 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "yyyyMMdd"
        L6:
            r2 = r3 & 2
            if (r2 == 0) goto L12
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r3 = "ENGLISH"
            p214m2.C4339q.m9705j(r2, r3)
            goto L13
        L12:
            r2 = 0
        L13:
            java.lang.String r3 = "locale"
            p214m2.C4339q.m9706k(r2, r3)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r1, r2)
            java.util.Date r0 = r0.getTime()
            java.lang.String r0 = r3.format(r0)
            java.lang.String r1 = "myFormat.format(date)"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }

    /* renamed from: f */
    public static final void m13505f(android.app.Activity r1, android.view.View r2) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L23
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L1a
            android.view.View r2 = r1.getCurrentFocus()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L1a
            android.view.View r2 = new android.view.View     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2b
        L1a:
            android.os.IBinder r1 = r2.getWindowToken()     // Catch: java.lang.Throwable -> L2b
            r2 = 2
            r0.hideSoftInputFromWindow(r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L23:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            throw r1     // Catch: java.lang.Throwable -> L2b
        L2b:
            r1 = move-exception
            p074e9.C1805a.m4520e(r1)
        L2f:
            return
    }

    /* renamed from: g */
    public static final double m13506g(double r3, double r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            return r0
        Lc:
            double r3 = r3 / r5
            return r3
    }

    /* renamed from: h */
    public static final void m13507h(androidx.cardview.widget.CardView r1, int r2) {
            android.content.Context r0 = r1.getContext()
            int r2 = p046d0.C1259a.m3706b(r0, r2)
            r1.setCardBackgroundColor(r2)
            return
    }

    /* renamed from: i */
    public static final void m13508i(android.view.View r1, int r2, mh.InterfaceC4620l<? super android.view.View, ch.C0985l> r3) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            java.lang.String r0 = "callback"
            p214m2.C4339q.m9706k(r3, r0)
            ee.c r0 = new ee.c
            r0.<init>(r2, r3)
            r1.setOnClickListener(r0)
            return
    }

    /* renamed from: j */
    public static /* synthetic */ void m13509j(android.view.View r0, int r1, mh.InterfaceC4620l r2, int r3) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            r1 = 600(0x258, float:8.41E-43)
        L6:
            m13508i(r0, r1, r2)
            return
    }

    /* renamed from: k */
    public static final void m13510k(android.widget.TextView r1, int r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            android.content.Context r0 = r1.getContext()
            int r2 = p046d0.C1259a.m3706b(r0, r2)
            r1.setTextColor(r2)
            return
    }

    /* renamed from: l */
    public static void m13511l(android.content.Context r0, java.lang.String r1, int r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            if (r0 == 0) goto Le
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        Le:
            return
    }

    /* renamed from: m */
    public static void m13512m(androidx.fragment.app.ComponentCallbacksC0395n r0, java.lang.String r1, int r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "string"
            p214m2.C4339q.m9706k(r1, r3)
            if (r0 == 0) goto L1c
            androidx.fragment.app.s r0 = r0.m1333s()
            if (r0 == 0) goto L1c
            p214m2.C4339q.m9706k(r1, r3)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        L1c:
            return
    }
}
