package p030c0;

/* renamed from: c0.l */
/* loaded from: classes.dex */
public class C0825l extends p030c0.AbstractC0827n {

    /* renamed from: b */
    public java.lang.CharSequence f4460b;

    public C0825l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p030c0.AbstractC0827n
    /* renamed from: a */
    public void mo2481a(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "androidx.core.app.extra.COMPAT_TEMPLATE"
            java.lang.String r1 = "androidx.core.app.NotificationCompat$BigTextStyle"
            r3.putString(r0, r1)
            return
    }

    @Override // p030c0.AbstractC0827n
    /* renamed from: b */
    public void mo2475b(p030c0.InterfaceC0822i r2) {
            r1 = this;
            android.app.Notification$BigTextStyle r0 = new android.app.Notification$BigTextStyle
            c0.o r2 = (p030c0.C0828o) r2
            android.app.Notification$Builder r2 = r2.f4489b
            r0.<init>(r2)
            r2 = 0
            android.app.Notification$BigTextStyle r2 = r0.setBigContentTitle(r2)
            java.lang.CharSequence r0 = r1.f4460b
            r2.bigText(r0)
            return
    }

    @Override // p030c0.AbstractC0827n
    /* renamed from: c */
    public java.lang.String mo2476c() {
            r1 = this;
            java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
            return r0
    }
}
