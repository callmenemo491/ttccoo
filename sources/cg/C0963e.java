package cg;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.ui.tools.player.MyJsonSource$updateCatalog$2", m7452f = "MyJsonSource.kt", m7453l = {78}, m7454m = "invokeSuspend")
/* renamed from: cg.e */
/* loaded from: classes.dex */
public final class C0963e extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super java.util.List<? extends android.support.v4.media.MediaMetadataCompat>>, java.lang.Object> {

    /* renamed from: c0 */
    public int f4983c0;

    /* renamed from: d0 */
    public final /* synthetic */ cg.C0962d f4984d0;

    public C0963e(cg.C0962d r1, p101fh.InterfaceC2172d<? super cg.C0963e> r2) {
            r0 = this;
            r0.f4984d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
            r1 = this;
            cg.e r2 = new cg.e
            cg.d r0 = r1.f4984d0
            r2.<init>(r0, r3)
            return r2
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super java.util.List<? extends android.support.v4.media.MediaMetadataCompat>> r3) {
            r1 = this;
            vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
            fh.d r3 = (p101fh.InterfaceC2172d) r3
            cg.e r2 = new cg.e
            cg.d r0 = r1.f4984d0
            r2.<init>(r0, r3)
            ch.l r3 = ch.C0985l.f5061a
            java.lang.Object r2 = r2.mo123o(r3)
            return r2
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r10) {
            r9 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r9.f4983c0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r10)     // Catch: java.lang.Exception -> L168
            goto L25
        Ld:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L15:
            p074e9.C1805a.m4540y(r10)
            cg.d r10 = r9.f4984d0     // Catch: java.lang.Exception -> L168
            nd.c1 r10 = r10.f4975b0     // Catch: java.lang.Exception -> L168
            r9.f4983c0 = r2     // Catch: java.lang.Exception -> L168
            java.lang.Object r10 = r10.m10816b(r9)     // Catch: java.lang.Exception -> L168
            if (r10 != r0) goto L25
            return r0
        L25:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L168
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p062dh.C1469e.m3992D(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L36:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L143
            java.lang.Object r1 = r10.next()
            od.m0 r1 = (p255od.C5216m0) r1
            io.tacocrypto.app.media.library.AlbumArtContentProvider r3 = io.tacocrypto.app.media.library.AlbumArtContentProvider.f14251Y
            java.lang.String r3 = r1.getCover()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "parse(song.cover)"
            p214m2.C4339q.m9705j(r3, r4)
            java.lang.String r4 = "uri"
            p214m2.C4339q.m9706k(r3, r4)
            java.lang.String r4 = r3.getEncodedPath()
            if (r4 == 0) goto L93
            java.lang.String r4 = r4.substring(r2)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r4, r5)
            r5 = 47
            r6 = 58
            r7 = 0
            r8 = 4
            java.lang.String r4 = p362uh.C6463i.m13056M(r4, r5, r6, r7, r8)
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            java.lang.String r6 = "io.tacocrypto.app"
            android.net.Uri$Builder r5 = r5.authority(r6)
            android.net.Uri$Builder r4 = r5.path(r4)
            android.net.Uri r4 = r4.build()
            java.util.Map<android.net.Uri, android.net.Uri> r5 = io.tacocrypto.app.media.library.AlbumArtContentProvider.f14252Z
            java.lang.String r6 = "contentUri"
            p214m2.C4339q.m9705j(r4, r6)
            r5.put(r4, r3)
            goto L9a
        L93:
            android.net.Uri r4 = android.net.Uri.EMPTY
            java.lang.String r3 = "EMPTY"
            p214m2.C4339q.m9705j(r4, r3)
        L9a:
            android.support.v4.media.MediaMetadataCompat$b r3 = new android.support.v4.media.MediaMetadataCompat$b
            r3.<init>()
            java.lang.String r5 = "<this>"
            p214m2.C4339q.m9706k(r3, r5)
            java.lang.String r5 = "songTaco"
            p214m2.C4339q.m9706k(r1, r5)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            double r6 = r1.getDuration()
            long r6 = (long) r6
            long r5 = r5.toMillis(r6)
            int r7 = r1.getId()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "android.media.metadata.MEDIA_ID"
            r3.m236d(r8, r7)
            java.lang.String r7 = r1.getName()
            java.lang.String r8 = "android.media.metadata.TITLE"
            r3.m236d(r8, r7)
            java.lang.String r7 = r1.getAuthor()
            java.lang.String r8 = "android.media.metadata.ARTIST"
            r3.m236d(r8, r7)
            java.lang.String r7 = r1.getAlbum()
            java.lang.String r8 = "android.media.metadata.ALBUM"
            r3.m236d(r8, r7)
            java.lang.String r7 = "android.media.metadata.DURATION"
            r3.m235c(r7, r5)
            java.lang.String r5 = "android.media.metadata.GENRE"
            java.lang.String r6 = ""
            r3.m236d(r5, r6)
            java.lang.String r5 = r1.getUrl()
            java.lang.String r6 = "android.media.metadata.MEDIA_URI"
            r3.m236d(r6, r5)
            java.lang.String r5 = r1.getCover()
            java.lang.String r6 = "android.media.metadata.ALBUM_ART_URI"
            r3.m236d(r6, r5)
            r5 = 2
            long r7 = (long) r5
            java.lang.String r5 = "io.tacocrypto.app.media.METADATA_KEY_UAMP_FLAGS"
            r3.m235c(r5, r7)
            java.lang.String r5 = r1.getName()
            java.lang.String r7 = "android.media.metadata.DISPLAY_TITLE"
            r3.m236d(r7, r5)
            java.lang.String r5 = r1.getAuthor()
            java.lang.String r7 = "android.media.metadata.DISPLAY_SUBTITLE"
            r3.m236d(r7, r5)
            java.lang.String r5 = r1.getAlbum()
            java.lang.String r7 = "android.media.metadata.DISPLAY_DESCRIPTION"
            r3.m236d(r7, r5)
            java.lang.String r1 = r1.getCover()
            java.lang.String r5 = "android.media.metadata.DISPLAY_ICON_URI"
            r3.m236d(r5, r1)
            r7 = 0
            java.lang.String r1 = "android.media.metadata.DOWNLOAD_STATUS"
            r3.m235c(r1, r7)
            java.lang.String r1 = r4.toString()
            r3.m236d(r5, r1)
            java.lang.String r1 = r4.toString()
            r3.m236d(r6, r1)
            android.support.v4.media.MediaMetadataCompat r1 = r3.m233a()
            r0.add(r1)
            goto L36
        L143:
            java.util.List r10 = p062dh.C1473i.m4007S(r0)
            java.util.Iterator r0 = r10.iterator()
        L14b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L167
            java.lang.Object r1 = r0.next()
            android.support.v4.media.MediaMetadataCompat r1 = (android.support.v4.media.MediaMetadataCompat) r1
            android.support.v4.media.MediaDescriptionCompat r2 = r1.m230d()
            android.os.Bundle r2 = r2.f491e0
            if (r2 == 0) goto L14b
            android.os.Bundle r1 = r1.m229c()
            r2.putAll(r1)
            goto L14b
        L167:
            return r10
        L168:
            r10 = 0
            return r10
    }
}
