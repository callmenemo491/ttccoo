package p436yd;

/* renamed from: yd.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C7160e implements androidx.lifecycle.InterfaceC0439e0 {

    /* renamed from: a */
    public final /* synthetic */ int f27620a;

    /* renamed from: b */
    public final /* synthetic */ p436yd.C7161f f27621b;

    /* renamed from: c */
    public final /* synthetic */ gd.C2326a f27622c;

    public /* synthetic */ C7160e(gd.C2326a r2, p436yd.C7161f r3) {
            r1 = this;
            r0 = 1
            r1.f27620a = r0
            r1.<init>()
            r1.f27622c = r2
            r1.f27621b = r3
            return
    }

    public /* synthetic */ C7160e(p436yd.C7161f r2, gd.C2326a r3) {
            r1 = this;
            r0 = 0
            r1.f27620a = r0
            r1.<init>()
            r1.f27621b = r2
            r1.f27622c = r3
            return
    }

    @Override // androidx.lifecycle.InterfaceC0439e0
    /* renamed from: d */
    public final void mo124d(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f27620a
            java.lang.String r1 = "$musicServiceConnection"
            java.lang.String r2 = "this$0"
            switch(r0) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            yd.f r0 = r4.f27621b
            gd.a r3 = r4.f27622c
            android.support.v4.media.session.PlaybackStateCompat r5 = (android.support.v4.media.session.PlaybackStateCompat) r5
            p214m2.C4339q.m9706k(r0, r2)
            p214m2.C4339q.m9706k(r3, r1)
            if (r5 != 0) goto L1a
            android.support.v4.media.session.PlaybackStateCompat r5 = gd.C2327b.f10578a
        L1a:
            r0.f27627g = r5
            androidx.lifecycle.d0<android.support.v4.media.MediaMetadataCompat> r5 = r3.f10570d
            java.lang.Object r5 = r5.m1411d()
            android.support.v4.media.MediaMetadataCompat r5 = (android.support.v4.media.MediaMetadataCompat) r5
            if (r5 != 0) goto L28
            android.support.v4.media.MediaMetadataCompat r5 = gd.C2327b.f10579b
        L28:
            java.lang.String r1 = "musicServiceConnection.n\u2026.value ?: NOTHING_PLAYING"
            p214m2.C4339q.m9705j(r5, r1)
            android.support.v4.media.session.PlaybackStateCompat r1 = r0.f27627g
            r0.m14271d(r1, r5)
            return
        L33:
            gd.a r0 = r4.f27622c
            yd.f r3 = r4.f27621b
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            p214m2.C4339q.m9706k(r0, r1)
            p214m2.C4339q.m9706k(r3, r2)
            androidx.lifecycle.d0<java.lang.Boolean> r5 = r0.f10567a
            java.lang.Object r5 = r5.m1411d()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r5 = p214m2.C4339q.m9702c(r5, r1)
            if (r5 == 0) goto L62
            androidx.lifecycle.LiveData<java.lang.Boolean> r5 = r3.f27630j
            java.lang.Object r5 = r5.m1411d()
            boolean r5 = p214m2.C4339q.m9702c(r5, r1)
            if (r5 == 0) goto L62
            android.os.Bundle r5 = android.os.Bundle.EMPTY
            yd.g r1 = p436yd.C7162g.f27641Z
            java.lang.String r2 = " io.tacocrypto.app.mymusicservice.COMMAND.REFRESH_IF_EMPTY"
            r0.m6086b(r2, r5, r1)
        L62:
            return
    }
}
