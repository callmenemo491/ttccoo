package p031c1;

/* renamed from: c1.b */
/* loaded from: classes.dex */
public class C0834b extends p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> {

    /* renamed from: f */
    public final /* synthetic */ p016b.C0652b f4556f;

    public C0834b(p031c1.AbstractServiceC0833a r1, java.lang.Object r2, p016b.C0652b r3) {
            r0 = this;
            r0.f4556f = r3
            r0.<init>(r2)
            return
    }

    @Override // p031c1.AbstractServiceC0833a.i
    /* renamed from: c */
    public void mo2505c(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4) {
            r3 = this;
            java.util.List r4 = (java.util.List) r4
            int r0 = r3.f4551e
            r0 = r0 & 4
            if (r0 != 0) goto L24
            if (r4 != 0) goto Lb
            goto L24
        Lb:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 0
            android.support.v4.media.MediaBrowserCompat$MediaItem[] r2 = new android.support.v4.media.MediaBrowserCompat.MediaItem[r1]
            java.lang.Object[] r4 = r4.toArray(r2)
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            java.lang.String r2 = "search_results"
            r0.putParcelableArray(r2, r4)
            b.b r4 = r3.f4556f
            r4.m2197b(r1, r0)
            goto L2b
        L24:
            b.b r4 = r3.f4556f
            r0 = -1
            r1 = 0
            r4.m2197b(r0, r1)
        L2b:
            return
    }
}
