package p047d1;

/* renamed from: d1.b */
/* loaded from: classes.dex */
public class C1261b extends p030c0.AbstractC0827n {

    /* renamed from: b */
    public int[] f6735b;

    /* renamed from: c */
    public android.support.v4.media.session.MediaSessionCompat.Token f6736c;

    public C1261b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6735b = r0
            return
    }

    @Override // p030c0.AbstractC0827n
    /* renamed from: b */
    public void mo2475b(p030c0.InterfaceC0822i r4) {
            r3 = this;
            c0.o r4 = (p030c0.C0828o) r4
            android.app.Notification$Builder r4 = r4.f4489b
            android.app.Notification$MediaStyle r0 = p047d1.C1260a.m3720a()
            int[] r1 = r3.f6735b
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r3.f6736c
            android.app.Notification$MediaStyle r0 = p047d1.C1260a.m3721b(r0, r1, r2)
            p047d1.C1260a.m3723d(r4, r0)
            return
    }

    @Override // p030c0.AbstractC0827n
    /* renamed from: d */
    public android.widget.RemoteViews mo2489d(p030c0.InterfaceC0822i r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // p030c0.AbstractC0827n
    /* renamed from: e */
    public android.widget.RemoteViews mo2490e(p030c0.InterfaceC0822i r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
