package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
public class C0297q {

    /* renamed from: c */
    public static final int[] f1406c = null;

    /* renamed from: a */
    public final android.widget.ProgressBar f1407a;

    /* renamed from: b */
    public android.graphics.Bitmap f1408b;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [16843067, 16843068} // fill-array
            androidx.appcompat.widget.C0297q.f1406c = r0
            return
    }

    public C0297q(android.widget.ProgressBar r1) {
            r0 = this;
            r0.<init>()
            r0.f1407a = r1
            return
    }

    /* renamed from: a */
    public void mo774a(android.util.AttributeSet r9, int r10) {
            r8 = this;
            android.widget.ProgressBar r0 = r8.f1407a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.widget.C0297q.f1406c
            r2 = 0
            androidx.appcompat.widget.y0 r9 = androidx.appcompat.widget.C0314y0.m848r(r0, r9, r1, r10, r2)
            android.graphics.drawable.Drawable r10 = r9.m856h(r2)
            r0 = 1
            if (r10 == 0) goto L4d
            android.widget.ProgressBar r1 = r8.f1407a
            boolean r3 = r10 instanceof android.graphics.drawable.AnimationDrawable
            if (r3 == 0) goto L4a
            android.graphics.drawable.AnimationDrawable r10 = (android.graphics.drawable.AnimationDrawable) r10
            int r3 = r10.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r4 = new android.graphics.drawable.AnimationDrawable
            r4.<init>()
            boolean r5 = r10.isOneShot()
            r4.setOneShot(r5)
            r5 = 0
        L2d:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 >= r3) goto L46
            android.graphics.drawable.Drawable r7 = r10.getFrame(r5)
            android.graphics.drawable.Drawable r7 = r8.m775b(r7, r0)
            r7.setLevel(r6)
            int r6 = r10.getDuration(r5)
            r4.addFrame(r7, r6)
            int r5 = r5 + 1
            goto L2d
        L46:
            r4.setLevel(r6)
            r10 = r4
        L4a:
            r1.setIndeterminateDrawable(r10)
        L4d:
            android.graphics.drawable.Drawable r10 = r9.m856h(r0)
            if (r10 == 0) goto L5c
            android.widget.ProgressBar r0 = r8.f1407a
            android.graphics.drawable.Drawable r10 = r8.m775b(r10, r2)
            r0.setProgressDrawable(r10)
        L5c:
            android.content.res.TypedArray r9 = r9.f1501b
            r9.recycle()
            return
    }

    /* renamed from: b */
    public final android.graphics.drawable.Drawable m775b(android.graphics.drawable.Drawable r8, boolean r9) {
            r7 = this;
            boolean r0 = r8 instanceof p103g0.InterfaceC2202c
            if (r0 == 0) goto L16
            r0 = r8
            g0.c r0 = (p103g0.InterfaceC2202c) r0
            android.graphics.drawable.Drawable r1 = r0.mo5794b()
            if (r1 == 0) goto La3
            android.graphics.drawable.Drawable r9 = r7.m775b(r1, r9)
            r0.mo5793a(r9)
            goto La3
        L16:
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L58
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = 0
        L25:
            if (r3 >= r9) goto L46
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L3c
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L3a
            goto L3c
        L3a:
            r4 = 0
            goto L3d
        L3c:
            r4 = 1
        L3d:
            android.graphics.drawable.Drawable r4 = r7.m775b(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L25
        L46:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
        L4b:
            if (r2 >= r9) goto L57
            int r0 = r8.getId(r2)
            r1.setId(r2, r0)
            int r2 = r2 + 1
            goto L4b
        L57:
            return r1
        L58:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto La3
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            android.graphics.Bitmap r2 = r7.f1408b
            if (r2 != 0) goto L68
            r7.f1408b = r0
        L68:
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            r3 = 8
            float[] r3 = new float[r3]
            r3 = {x00a4: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r4 = new android.graphics.drawable.shapes.RoundRectShape
            r5 = 0
            r4.<init>(r3, r5, r5)
            r2.<init>(r4)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r0, r4, r5)
            android.graphics.Paint r0 = r2.getPaint()
            r0.setShader(r3)
            android.graphics.Paint r0 = r2.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto La2
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r2, r9, r1)
            r2 = r8
        La2:
            return r2
        La3:
            return r8
    }
}
