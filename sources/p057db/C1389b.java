package p057db;

/* renamed from: db.b */
/* loaded from: classes.dex */
public final class C1389b {

    /* renamed from: a */
    public static final java.util.concurrent.atomic.AtomicInteger f7001a = null;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r2 = (int) r1
            r0.<init>(r2)
            p057db.C1389b.f7001a = r0
            return
    }

    @android.annotation.TargetApi(26)
    /* renamed from: a */
    public static boolean m3909a(android.content.res.Resources r4, int r5) {
            java.lang.String r0 = "FirebaseMessaging"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 26
            if (r1 == r3) goto La
            return r2
        La:
            r1 = 0
            r3 = 0
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5, r1)     // Catch: android.content.res.Resources.NotFoundException -> L2c
            boolean r4 = r4 instanceof android.graphics.drawable.AdaptiveIconDrawable     // Catch: android.content.res.Resources.NotFoundException -> L2c
            if (r4 == 0) goto L2b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L2c
            r1 = 77
            r4.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> L2c
            java.lang.String r1 = "Adaptive icons cannot be used in notifications. Ignoring icon id: "
            r4.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L2c
            r4.append(r5)     // Catch: android.content.res.Resources.NotFoundException -> L2c
            java.lang.String r4 = r4.toString()     // Catch: android.content.res.Resources.NotFoundException -> L2c
            android.util.Log.e(r0, r4)     // Catch: android.content.res.Resources.NotFoundException -> L2c
            return r3
        L2b:
            return r2
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r1 = 66
            r4.<init>(r1)
            java.lang.String r1 = "Couldn't find resource "
            r4.append(r1)
            r4.append(r5)
            java.lang.String r5 = ", treating it as an invalid icon"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r0, r4)
            return r3
    }
}
