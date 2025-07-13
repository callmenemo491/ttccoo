package p292qd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.media.PersistentStorage$saveRecentSong$2", m7452f = "PersistentStorage.kt", m7453l = {}, m7454m = "invokeSuspend")
/* renamed from: qd.h */
/* loaded from: classes.dex */
public final class C5624h extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public /* synthetic */ java.lang.Object f21886c0;

    /* renamed from: d0 */
    public final /* synthetic */ android.support.v4.media.MediaDescriptionCompat f21887d0;

    /* renamed from: e0 */
    public final /* synthetic */ p292qd.C5623g f21888e0;

    /* renamed from: f0 */
    public final /* synthetic */ long f21889f0;

    public C5624h(android.support.v4.media.MediaDescriptionCompat r1, p292qd.C5623g r2, long r3, p101fh.InterfaceC2172d<? super p292qd.C5624h> r5) {
            r0 = this;
            r0.f21887d0 = r1
            r0.f21888e0 = r2
            r0.f21889f0 = r3
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r8, p101fh.InterfaceC2172d<?> r9) {
            r7 = this;
            qd.h r6 = new qd.h
            android.support.v4.media.MediaDescriptionCompat r1 = r7.f21887d0
            qd.g r2 = r7.f21888e0
            long r3 = r7.f21889f0
            r0 = r6
            r5 = r9
            r0.<init>(r1, r2, r3, r5)
            r6.f21886c0 = r8
            return r6
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r7, p101fh.InterfaceC2172d<? super ch.C0985l> r8) {
            r6 = this;
            vh.b0 r7 = (p379vh.InterfaceC6686b0) r7
            r5 = r8
            fh.d r5 = (p101fh.InterfaceC2172d) r5
            qd.h r8 = new qd.h
            android.support.v4.media.MediaDescriptionCompat r1 = r6.f21887d0
            qd.g r2 = r6.f21888e0
            long r3 = r6.f21889f0
            r0 = r8
            r0.<init>(r1, r2, r3, r5)
            r8.f21886c0 = r7
            ch.l r7 = ch.C0985l.f5061a
            java.lang.Object r7 = r8.mo123o(r7)
            return r7
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r4) {
            r3 = this;
            p074e9.C1805a.m4540y(r4)
            java.lang.Object r4 = r3.f21886c0
            vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
            qd.g r4 = r3.f21888e0
            android.support.v4.media.MediaDescriptionCompat r0 = r3.f21887d0
            android.content.Context r4 = r4.f21884a     // Catch: java.lang.Throwable -> L5a
            com.bumptech.glide.j r4 = com.bumptech.glide.ComponentCallbacks2C0999c.m2736e(r4)     // Catch: java.lang.Throwable -> L5a
            com.bumptech.glide.i r4 = r4.mo2767p()     // Catch: java.lang.Throwable -> L5a
            android.net.Uri r0 = r0.f490d0     // Catch: java.lang.Throwable -> L5a
            com.bumptech.glide.i r4 = r4.mo2756S(r0)     // Catch: java.lang.Throwable -> L5a
            r0 = 144(0x90, float:2.02E-43)
            c3.c r4 = r4.m2761X(r0, r0)     // Catch: java.lang.Throwable -> L5a
            c3.f r4 = (p033c3.C0860f) r4     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "with(context).asFile().l\u2026ON_LARGE_ICON_SIZE).get()"
            p214m2.C4339q.m9705j(r4, r0)     // Catch: java.lang.Throwable -> L5a
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r4, r0)     // Catch: java.lang.Throwable -> L5a
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L5a
            r0.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "io.tacocrypto.app"
            android.net.Uri$Builder r0 = r0.authority(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Throwable -> L5a
            android.net.Uri$Builder r4 = r0.appendPath(r4)     // Catch: java.lang.Throwable -> L5a
            android.net.Uri r4 = r4.build()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "Builder()\n        .schem\u2026is.path)\n        .build()"
            p214m2.C4339q.m9705j(r4, r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5a
            goto L5f
        L5a:
            r4 = move-exception
            java.lang.Object r4 = p074e9.C1805a.m4520e(r4)
        L5f:
            boolean r0 = r4 instanceof ch.C0979f.a
            if (r0 == 0) goto L64
            r4 = 0
        L64:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L6a
            java.lang.String r4 = ""
        L6a:
            android.support.v4.media.MediaDescriptionCompat r0 = r3.f21887d0
            java.lang.CharSequence r0 = r0.f486Z
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L7b
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L79
            goto L7b
        L79:
            r0 = 0
            goto L7c
        L7b:
            r0 = 1
        L7c:
            if (r0 == 0) goto L90
            android.support.v4.media.MediaDescriptionCompat r0 = r3.f21887d0
            java.lang.CharSequence r0 = r0.f487a0
            if (r0 == 0) goto L8a
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L8b
        L8a:
            r1 = 1
        L8b:
            if (r1 == 0) goto L90
            ch.l r4 = ch.C0985l.f5061a
            return r4
        L90:
            qd.g r0 = r3.f21888e0
            android.content.SharedPreferences r0 = r0.f21885b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.support.v4.media.MediaDescriptionCompat r1 = r3.f21887d0
            java.lang.String r1 = r1.f485Y
            java.lang.String r2 = "recent_song_media_id"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            android.support.v4.media.MediaDescriptionCompat r1 = r3.f21887d0
            java.lang.CharSequence r1 = r1.f486Z
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "recent_song_title"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            android.support.v4.media.MediaDescriptionCompat r1 = r3.f21887d0
            java.lang.CharSequence r1 = r1.f487a0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "recent_song_subtitle"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            java.lang.String r1 = "recent_song_icon_uri"
            android.content.SharedPreferences$Editor r4 = r0.putString(r1, r4)
            long r0 = r3.f21889f0
            java.lang.String r2 = "recent_song_position"
            android.content.SharedPreferences$Editor r4 = r4.putLong(r2, r0)
            r4.apply()
            ch.l r4 = ch.C0985l.f5061a
            return r4
    }
}
