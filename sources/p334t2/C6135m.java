package p334t2;

/* renamed from: t2.m */
/* loaded from: classes.dex */
public final class C6135m {

    /* renamed from: a */
    public static final p229n2.InterfaceC4673c f23694a = null;

    /* renamed from: t2.m$a */
    public class a extends p229n2.C4674d {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p229n2.C4674d, p229n2.InterfaceC4673c
        /* renamed from: f */
        public void mo10694f(android.graphics.Bitmap r1) {
                r0 = this;
                return
        }
    }

    static {
            t2.m$a r0 = new t2.m$a
            r0.<init>()
            p334t2.C6135m.f23694a = r0
            return
    }

    /* renamed from: a */
    public static p214m2.InterfaceC4345w<android.graphics.Bitmap> m12681a(p229n2.InterfaceC4673c r7, android.graphics.drawable.Drawable r8, int r9, int r10) {
            android.graphics.drawable.Drawable r8 = r8.getCurrent()
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L12
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r2 = r8.getBitmap()
            goto L97
        L12:
            boolean r0 = r8 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto L97
            java.lang.String r0 = "Unable to draw "
            r3 = 5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r5 = "DrawableToBitmap"
            if (r9 != r4) goto L43
            int r6 = r8.getIntrinsicWidth()
            if (r6 > 0) goto L43
            boolean r9 = android.util.Log.isLoggable(r5, r3)
            if (r9 == 0) goto L90
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"
        L38:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.w(r5, r8)
            goto L90
        L43:
            if (r10 != r4) goto L5f
            int r4 = r8.getIntrinsicHeight()
            if (r4 > 0) goto L5f
            boolean r9 = android.util.Log.isLoggable(r5, r3)
            if (r9 == 0) goto L90
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"
            goto L38
        L5f:
            int r0 = r8.getIntrinsicWidth()
            if (r0 <= 0) goto L69
            int r9 = r8.getIntrinsicWidth()
        L69:
            int r0 = r8.getIntrinsicHeight()
            if (r0 <= 0) goto L73
            int r10 = r8.getIntrinsicHeight()
        L73:
            java.util.concurrent.locks.Lock r0 = p334t2.C6144v.f23727b
            r0.lock()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = r7.mo10693e(r9, r10, r3)
            android.graphics.Canvas r4 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L92
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L92
            r8.setBounds(r1, r1, r9, r10)     // Catch: java.lang.Throwable -> L92
            r8.draw(r4)     // Catch: java.lang.Throwable -> L92
            r4.setBitmap(r2)     // Catch: java.lang.Throwable -> L92
            r0.unlock()
            r2 = r3
        L90:
            r1 = 1
            goto L97
        L92:
            r7 = move-exception
            r0.unlock()
            throw r7
        L97:
            if (r1 == 0) goto L9a
            goto L9c
        L9a:
            n2.c r7 = p334t2.C6135m.f23694a
        L9c:
            t2.d r7 = p334t2.C6126d.m12654f(r2, r7)
            return r7
    }
}
