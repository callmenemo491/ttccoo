package p292qd;

/* renamed from: qd.b */
/* loaded from: classes.dex */
public final class C5618b extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Boolean, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p292qd.ServiceC5617a f21857Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f21858a0;

    /* renamed from: b0 */
    public final /* synthetic */ android.os.Bundle f21859b0;

    /* renamed from: c0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> f21860c0;

    public C5618b(p292qd.ServiceC5617a r1, java.lang.String r2, android.os.Bundle r3, p031c1.AbstractServiceC0833a.i<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> r4) {
            r0 = this;
            r0.f21857Z = r1
            r0.f21858a0 = r2
            r0.f21859b0 = r3
            r0.f21860c0 = r4
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(java.lang.Boolean r8) {
            r7 = this;
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5f
            qd.a r8 = r7.f21857Z
            rd.c r8 = r8.f21815g0
            if (r8 == 0) goto L58
            java.lang.String r0 = r7.f21858a0
            android.os.Bundle r1 = r7.f21859b0
            if (r1 != 0) goto L16
            android.os.Bundle r1 = android.os.Bundle.EMPTY
        L16:
            java.lang.String r2 = "extras ?: Bundle.EMPTY"
            p214m2.C4339q.m9705j(r1, r2)
            java.util.List r8 = r8.mo12192y(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p062dh.C1469e.m3992D(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L2e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r8.next()
            android.support.v4.media.MediaMetadataCompat r1 = (android.support.v4.media.MediaMetadataCompat) r1
            android.support.v4.media.MediaBrowserCompat$MediaItem r2 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            android.support.v4.media.MediaDescriptionCompat r3 = r1.m230d()
            android.os.Bundle r1 = r1.f498Y
            r4 = 0
            java.lang.String r6 = "io.tacocrypto.app.media.METADATA_KEY_UAMP_FLAGS"
            long r4 = r1.getLong(r6, r4)
            int r1 = (int) r4
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L2e
        L52:
            c1.a$i<java.util.List<android.support.v4.media.MediaBrowserCompat$MediaItem>> r8 = r7.f21860c0
            r8.m2510d(r0)
            goto L5f
        L58:
            java.lang.String r8 = "mediaSource"
            p214m2.C4339q.m9713w(r8)
            r8 = 0
            throw r8
        L5f:
            ch.l r8 = ch.C0985l.f5061a
            return r8
    }
}
