package p031c1;

/* renamed from: c1.d */
/* loaded from: classes.dex */
public class C0836d extends p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> {

    /* renamed from: f */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.j f4559f;

    public C0836d(p031c1.AbstractServiceC0833a.e r1, java.lang.Object r2, p031c1.AbstractServiceC0833a.j r3) {
            r0 = this;
            r0.f4559f = r3
            r0.<init>(r2)
            return
    }

    @Override // p031c1.AbstractServiceC0833a.i
    /* renamed from: a */
    public void mo2508a() {
            r1 = this;
            c1.a$j r0 = r1.f4559f
            android.service.media.MediaBrowserService$Result r0 = r0.f4552a
            r0.detach()
            return
    }

    @Override // p031c1.AbstractServiceC0833a.i
    /* renamed from: c */
    public void mo2505c(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r5) {
            r4 = this;
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L25
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r5.next()
            android.support.v4.media.MediaBrowserCompat$MediaItem r1 = (android.support.v4.media.MediaBrowserCompat.MediaItem) r1
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r3 = 0
            r1.writeToParcel(r2, r3)
            r0.add(r2)
            goto Ld
        L25:
            r0 = 0
        L26:
            c1.a$j r5 = r4.f4559f
            r5.m2511a(r0)
            return
    }
}
