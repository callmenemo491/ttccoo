package p292qd;

/* renamed from: qd.g */
/* loaded from: classes.dex */
public final class C5623g {

    /* renamed from: c */
    public static final p292qd.C5623g.a f21882c = null;

    /* renamed from: d */
    public static volatile p292qd.C5623g f21883d;

    /* renamed from: a */
    public final android.content.Context f21884a;

    /* renamed from: b */
    public android.content.SharedPreferences f21885b;

    /* renamed from: qd.g$a */
    public static final class a {
        public a(p239nh.C4826f r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            qd.g$a r0 = new qd.g$a
            r1 = 0
            r0.<init>(r1)
            p292qd.C5623g.f21882c = r0
            return
    }

    public C5623g(android.content.Context r2, p239nh.C4826f r3) {
            r1 = this;
            r1.<init>()
            r1.f21884a = r2
            java.lang.String r3 = "taco_exoplayer"
            r0 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            java.lang.String r3 = "context.getSharedPrefere\u2026ontext.MODE_PRIVATE\n    )"
            p214m2.C4339q.m9705j(r2, r3)
            r1.f21885b = r2
            return
    }

    /* renamed from: a */
    public final android.support.v4.media.MediaBrowserCompat.MediaItem m11924a() {
            r12 = this;
            android.content.SharedPreferences r0 = r12.f21885b
            java.lang.String r1 = "recent_song_media_id"
            r2 = 0
            java.lang.String r4 = r0.getString(r1, r2)
            if (r4 != 0) goto Lc
            goto L4d
        Lc:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            android.content.SharedPreferences r0 = r12.f21885b
            r1 = 0
            java.lang.String r3 = "recent_song_position"
            long r0 = r0.getLong(r3, r1)
            java.lang.String r2 = "playback_start_position_ms"
            r10.putLong(r2, r0)
            android.support.v4.media.MediaBrowserCompat$MediaItem r2 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            r11 = 0
            r8 = 0
            r7 = 0
            android.content.SharedPreferences r0 = r12.f21885b
            java.lang.String r1 = "recent_song_title"
            java.lang.String r3 = ""
            java.lang.String r5 = r0.getString(r1, r3)
            android.content.SharedPreferences r0 = r12.f21885b
            java.lang.String r1 = "recent_song_subtitle"
            java.lang.String r6 = r0.getString(r1, r3)
            android.content.SharedPreferences r0 = r12.f21885b
            java.lang.String r1 = "recent_song_icon_uri"
            java.lang.String r0 = r0.getString(r1, r3)
            android.net.Uri r9 = android.net.Uri.parse(r0)
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 2
            r2.<init>(r0, r1)
        L4d:
            return r2
    }
}
