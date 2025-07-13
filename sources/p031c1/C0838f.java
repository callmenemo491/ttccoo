package p031c1;

/* renamed from: c1.f */
/* loaded from: classes.dex */
public class C0838f extends p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> {

    /* renamed from: f */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.j f4563f;

    /* renamed from: g */
    public final /* synthetic */ android.os.Bundle f4564g;

    /* renamed from: h */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.g f4565h;

    public C0838f(p031c1.AbstractServiceC0833a.g r1, java.lang.Object r2, p031c1.AbstractServiceC0833a.j r3, android.os.Bundle r4) {
            r0 = this;
            r0.f4565h = r1
            r0.f4563f = r3
            r0.f4564g = r4
            r0.<init>(r2)
            return
    }

    @Override // p031c1.AbstractServiceC0833a.i
    /* renamed from: a */
    public void mo2508a() {
            r1 = this;
            c1.a$j r0 = r1.f4563f
            android.service.media.MediaBrowserService$Result r0 = r0.f4552a
            r0.detach()
            return
    }

    @Override // p031c1.AbstractServiceC0833a.i
    /* renamed from: c */
    public void mo2505c(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r5) {
            r4 = this;
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L8
            c1.a$j r5 = r4.f4563f
            r0 = 0
            goto L3b
        L8:
            int r0 = r4.f4551e
            r0 = r0 & 1
            if (r0 == 0) goto L18
            c1.a$g r0 = r4.f4565h
            c1.a r0 = r0.f4545f
            android.os.Bundle r1 = r4.f4564g
            java.util.List r5 = r0.m2501a(r5, r1)
        L18:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L21:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r5.next()
            android.support.v4.media.MediaBrowserCompat$MediaItem r1 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r1
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r3 = 0
            r1.writeToParcel(r2, r3)
            r0.add(r2)
            goto L21
        L39:
            c1.a$j r5 = r4.f4563f
        L3b:
            r5.m2511a(r0)
            return
    }
}
