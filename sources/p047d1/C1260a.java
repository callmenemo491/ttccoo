package p047d1;

/* renamed from: d1.a */
/* loaded from: classes.dex */
public class C1260a {
    /* renamed from: a */
    public static android.app.Notification.MediaStyle m3720a() {
            android.app.Notification$MediaStyle r0 = new android.app.Notification$MediaStyle
            r0.<init>()
            return r0
    }

    /* renamed from: b */
    public static android.app.Notification.MediaStyle m3721b(android.app.Notification.MediaStyle r0, int[] r1, android.support.v4.media.session.MediaSessionCompat.Token r2) {
            if (r1 == 0) goto L5
            m3724e(r0, r1)
        L5:
            if (r2 == 0) goto Le
            java.lang.Object r1 = r2.f531Z
            android.media.session.MediaSession$Token r1 = (android.media.session.MediaSession.Token) r1
            m3722c(r0, r1)
        Le:
            return r0
    }

    /* renamed from: c */
    public static void m3722c(android.app.Notification.MediaStyle r0, android.media.session.MediaSession.Token r1) {
            r0.setMediaSession(r1)
            return
    }

    /* renamed from: d */
    public static void m3723d(android.app.Notification.Builder r0, android.app.Notification.MediaStyle r1) {
            r0.setStyle(r1)
            return
    }

    /* renamed from: e */
    public static void m3724e(android.app.Notification.MediaStyle r0, int... r1) {
            r0.setShowActionsInCompactView(r1)
            return
    }
}
