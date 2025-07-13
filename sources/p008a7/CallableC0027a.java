package p008a7;

/* renamed from: a7.a */
/* loaded from: classes.dex */
public final class CallableC0027a implements java.util.concurrent.Callable<java.lang.Boolean> {

    /* renamed from: a */
    public final /* synthetic */ int f63a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f64b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.String f65c;

    /* renamed from: d */
    public final /* synthetic */ java.lang.Object f66d;

    public CallableC0027a(android.content.SharedPreferences r2, java.lang.String r3, java.lang.Boolean r4) {
            r1 = this;
            r0 = 0
            r1.f63a = r0
            r1.f64b = r2
            r1.f65c = r3
            r1.f66d = r4
            r1.<init>()
            return
    }

    public CallableC0027a(android.content.SharedPreferences r2, java.lang.String r3, java.lang.Integer r4) {
            r1 = this;
            r0 = 1
            r1.f63a = r0
            r1.f64b = r2
            r1.f65c = r3
            r1.f66d = r4
            r1.<init>()
            return
    }

    public CallableC0027a(android.content.SharedPreferences r2, java.lang.String r3, java.lang.Long r4) {
            r1 = this;
            r0 = 2
            r1.f63a = r0
            r1.f64b = r2
            r1.f65c = r3
            r1.f66d = r4
            r1.<init>()
            return
    }

    public CallableC0027a(android.content.SharedPreferences r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 3
            r1.f63a = r0
            r1.f64b = r2
            r1.f65c = r3
            r1.f66d = r4
            r1.<init>()
            return
    }

    public CallableC0027a(p249o7.BinderC5042l4 r2, p249o7.C5077q r3, java.lang.String r4) {
            r1 = this;
            r0 = 4
            r1.f63a = r0
            r1.f66d = r2
            r1.f64b = r3
            r1.f65c = r4
            r1.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Boolean call() {
            r4 = this;
            int r0 = r4.f63a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L2c;
                case 2: goto L15;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto L5a
        L6:
            java.lang.Object r0 = r4.f64b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = r4.f65c
            java.lang.Object r2 = r4.f66d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
        L15:
            java.lang.Object r0 = r4.f64b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = r4.f65c
            java.lang.Object r2 = r4.f66d
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r0 = r0.getLong(r1, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L2c:
            java.lang.Object r0 = r4.f64b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = r4.f65c
            java.lang.Object r2 = r4.f66d
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r0 = r0.getInt(r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L43:
            java.lang.Object r0 = r4.f64b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = r4.f65c
            java.lang.Object r2 = r4.f66d
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r0 = r0.getBoolean(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5a:
            java.lang.Object r0 = r4.f66d
            o7.l4 r0 = (p249o7.BinderC5042l4) r0
            o7.m6 r0 = r0.f19823a
            r0.m11347a()
            java.lang.Object r0 = r4.f66d
            o7.l4 r0 = (p249o7.BinderC5042l4) r0
            o7.m6 r0 = r0.f19823a
            o7.i5 r0 = r0.f19867h
            p249o7.C5052m6.m11327I(r0)
            java.lang.Object r1 = r4.f64b
            o7.q r1 = (p249o7.C5077q) r1
            r0.mo3183i()
            com.google.android.gms.measurement.internal.C1113d.m3154j()
            r0 = 0
            throw r0
    }
}
