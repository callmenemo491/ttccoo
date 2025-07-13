package p030c0;

/* renamed from: c0.k */
/* loaded from: classes.dex */
public class C0824k extends p030c0.AbstractC0827n {

    /* renamed from: b */
    public android.graphics.Bitmap f4457b;

    /* renamed from: c */
    public androidx.core.graphics.drawable.IconCompat f4458c;

    /* renamed from: d */
    public boolean f4459d;

    /* renamed from: c0.k$a */
    public static class a {
        /* renamed from: a */
        public static void m2478a(android.app.Notification.BigPictureStyle r0, android.graphics.Bitmap r1) {
                r0.bigLargeIcon(r1)
                return
        }
    }

    /* renamed from: c0.k$b */
    public static class b {
        /* renamed from: a */
        public static void m2479a(android.app.Notification.BigPictureStyle r0, android.graphics.drawable.Icon r1) {
                r0.bigLargeIcon(r1)
                return
        }
    }

    /* renamed from: c0.k$c */
    public static class c {
        /* renamed from: a */
        public static void m2480a(android.app.Notification.BigPictureStyle r0, boolean r1) {
                r0.showBigPictureWhenCollapsed(r1)
                return
        }
    }

    public C0824k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p030c0.AbstractC0827n
    /* renamed from: b */
    public void mo2475b(p030c0.InterfaceC0822i r8) {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            android.app.Notification$BigPictureStyle r1 = new android.app.Notification$BigPictureStyle
            c0.o r8 = (p030c0.C0828o) r8
            android.app.Notification$Builder r2 = r8.f4489b
            r1.<init>(r2)
            r2 = 0
            android.app.Notification$BigPictureStyle r1 = r1.setBigContentTitle(r2)
            android.graphics.Bitmap r3 = r7.f4457b
            android.app.Notification$BigPictureStyle r1 = r1.bigPicture(r3)
            boolean r3 = r7.f4459d
            if (r3 == 0) goto L72
            androidx.core.graphics.drawable.IconCompat r3 = r7.f4458c
            if (r3 != 0) goto L1f
            goto L6f
        L1f:
            r4 = 23
            if (r0 < r4) goto L2d
            android.content.Context r8 = r8.f4488a
            android.graphics.drawable.Icon r8 = r3.m1015i(r8)
            p030c0.C0824k.b.m2479a(r1, r8)
            goto L72
        L2d:
            int r8 = r3.m1011e()
            r3 = 1
            if (r8 != r3) goto L6f
            androidx.core.graphics.drawable.IconCompat r8 = r7.f4458c
            int r5 = r8.f1956a
            r6 = -1
            if (r5 != r6) goto L44
            if (r0 < r4) goto L44
            java.lang.Object r8 = r8.f1957b
            boolean r3 = r8 instanceof android.graphics.Bitmap
            if (r3 == 0) goto L6f
            goto L48
        L44:
            if (r5 != r3) goto L4c
            java.lang.Object r8 = r8.f1957b
        L48:
            r2 = r8
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            goto L6f
        L4c:
            r2 = 5
            if (r5 != r2) goto L58
            java.lang.Object r8 = r8.f1957b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap r2 = androidx.core.graphics.drawable.IconCompat.m1007a(r8, r3)
            goto L6f
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getBitmap() on "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L6f:
            p030c0.C0824k.a.m2478a(r1, r2)
        L72:
            r8 = 31
            if (r0 < r8) goto L7a
            r8 = 0
            p030c0.C0824k.c.m2480a(r1, r8)
        L7a:
            return
    }

    @Override // p030c0.AbstractC0827n
    /* renamed from: c */
    public java.lang.String mo2476c() {
            r1 = this;
            java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
            return r0
    }

    /* renamed from: g */
    public p030c0.C0824k m2477g(android.graphics.Bitmap r1) {
            r0 = this;
            r1 = 0
            r0.f4458c = r1
            r1 = 1
            r0.f4459d = r1
            return r0
    }
}
