package p057db;

/* renamed from: db.x */
/* loaded from: classes.dex */
public final class C1423x extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p057db.C1423x> CREATOR = null;

    /* renamed from: Y */
    public android.os.Bundle f7101Y;

    /* renamed from: Z */
    public java.util.Map<java.lang.String, java.lang.String> f7102Z;

    /* renamed from: a0 */
    public p057db.C1423x.b f7103a0;

    /* renamed from: db.x$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: db.x$b */
    public static class b {

        /* renamed from: a */
        public final java.lang.String f7104a;

        /* renamed from: b */
        public final java.lang.String f7105b;

        public b(p057db.C1422w r2, p057db.C1423x.a r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r3 = "gcm.n.title"
                java.lang.String r0 = r2.m3962j(r3)
                r1.f7104a = r0
                r2.m3959g(r3)
                m3965a(r2, r3)
                java.lang.String r3 = "gcm.n.body"
                java.lang.String r0 = r2.m3962j(r3)
                r1.f7105b = r0
                r2.m3959g(r3)
                m3965a(r2, r3)
                java.lang.String r3 = "gcm.n.icon"
                r2.m3962j(r3)
                java.lang.String r3 = "gcm.n.sound2"
                java.lang.String r3 = r2.m3962j(r3)
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L35
                java.lang.String r3 = "gcm.n.sound"
                r2.m3962j(r3)
            L35:
                java.lang.String r3 = "gcm.n.tag"
                r2.m3962j(r3)
                java.lang.String r3 = "gcm.n.color"
                r2.m3962j(r3)
                java.lang.String r3 = "gcm.n.click_action"
                r2.m3962j(r3)
                java.lang.String r3 = "gcm.n.android_channel_id"
                r2.m3962j(r3)
                r2.m3957e()
                java.lang.String r3 = "gcm.n.image"
                r2.m3962j(r3)
                java.lang.String r3 = "gcm.n.ticker"
                r2.m3962j(r3)
                java.lang.String r3 = "gcm.n.notification_priority"
                r2.m3954b(r3)
                java.lang.String r3 = "gcm.n.visibility"
                r2.m3954b(r3)
                java.lang.String r3 = "gcm.n.notification_count"
                r2.m3954b(r3)
                java.lang.String r3 = "gcm.n.sticky"
                r2.m3953a(r3)
                java.lang.String r3 = "gcm.n.local_only"
                r2.m3953a(r3)
                java.lang.String r3 = "gcm.n.default_sound"
                r2.m3953a(r3)
                java.lang.String r3 = "gcm.n.default_vibrate_timings"
                r2.m3953a(r3)
                java.lang.String r3 = "gcm.n.default_light_settings"
                r2.m3953a(r3)
                java.lang.String r3 = "gcm.n.event_time"
                r2.m3960h(r3)
                r2.m3956d()
                r2.m3963k()
                return
        }

        /* renamed from: a */
        public static java.lang.String[] m3965a(p057db.C1422w r2, java.lang.String r3) {
                java.lang.Object[] r2 = r2.m3958f(r3)
                if (r2 != 0) goto L8
                r2 = 0
                return r2
            L8:
                int r3 = r2.length
                java.lang.String[] r3 = new java.lang.String[r3]
                r0 = 0
            Lc:
                int r1 = r2.length
                if (r0 >= r1) goto L1a
                r1 = r2[r0]
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r3[r0] = r1
                int r0 = r0 + 1
                goto Lc
            L1a:
                return r3
        }
    }

    static {
            db.y r0 = new db.y
            r0.<init>()
            p057db.C1423x.CREATOR = r0
            return
    }

    public C1423x(android.os.Bundle r1) {
            r0 = this;
            r0.<init>()
            r0.f7101Y = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 2
            android.os.Bundle r1 = r3.f7101Y
            r2 = 0
            p270p6.C5369c.m11714b(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
