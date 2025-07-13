package androidx.mediarouter.app;

/* loaded from: classes.dex */
final class OverlayListView extends android.widget.ListView {

    /* renamed from: a0 */
    public final java.util.List<androidx.mediarouter.app.OverlayListView.C0480a> f2603a0;

    /* renamed from: androidx.mediarouter.app.OverlayListView$a */
    public static class C0480a {

        /* renamed from: a */
        public android.graphics.drawable.BitmapDrawable f2604a;

        /* renamed from: b */
        public float f2605b;

        /* renamed from: c */
        public android.graphics.Rect f2606c;

        /* renamed from: d */
        public android.view.animation.Interpolator f2607d;

        /* renamed from: e */
        public long f2608e;

        /* renamed from: f */
        public android.graphics.Rect f2609f;

        /* renamed from: g */
        public int f2610g;

        /* renamed from: h */
        public float f2611h;

        /* renamed from: i */
        public float f2612i;

        /* renamed from: j */
        public long f2613j;

        /* renamed from: k */
        public boolean f2614k;

        /* renamed from: l */
        public boolean f2615l;

        /* renamed from: m */
        public androidx.mediarouter.app.OverlayListView.C0480a.a f2616m;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a */
        public interface a {
        }

        public C0480a(android.graphics.drawable.BitmapDrawable r2, android.graphics.Rect r3) {
                r1 = this;
                r1.<init>()
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.f2605b = r0
                r1.f2611h = r0
                r1.f2612i = r0
                r1.f2604a = r2
                r1.f2609f = r3
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>(r3)
                r1.f2606c = r2
                android.graphics.drawable.BitmapDrawable r2 = r1.f2604a
                if (r2 == 0) goto L2b
                float r3 = r1.f2605b
                r0 = 1132396544(0x437f0000, float:255.0)
                float r3 = r3 * r0
                int r3 = (int) r3
                r2.setAlpha(r3)
                android.graphics.drawable.BitmapDrawable r2 = r1.f2604a
                android.graphics.Rect r3 = r1.f2606c
                r2.setBounds(r3)
            L2b:
                return
        }
    }

    public OverlayListView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f2603a0 = r1
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            java.util.List<androidx.mediarouter.app.OverlayListView$a> r0 = r9.f2603a0
            int r0 = r0.size()
            if (r0 <= 0) goto Lae
            java.util.List<androidx.mediarouter.app.OverlayListView$a> r0 = r9.f2603a0
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            androidx.mediarouter.app.OverlayListView$a r1 = (androidx.mediarouter.app.OverlayListView.C0480a) r1
            android.graphics.drawable.BitmapDrawable r2 = r1.f2604a
            if (r2 == 0) goto L24
            r2.draw(r10)
        L24:
            long r2 = r9.getDrawingTime()
            boolean r4 = r1.f2615l
            if (r4 == 0) goto L2f
            r1 = 0
            goto La7
        L2f:
            long r4 = r1.f2613j
            long r2 = r2 - r4
            float r2 = (float) r2
            long r3 = r1.f2608e
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            r4 = 0
            float r2 = java.lang.Math.max(r4, r2)
            boolean r5 = r1.f2614k
            if (r5 != 0) goto L47
            goto L48
        L47:
            r4 = r2
        L48:
            android.view.animation.Interpolator r2 = r1.f2607d
            if (r2 != 0) goto L4e
            r2 = r4
            goto L52
        L4e:
            float r2 = r2.getInterpolation(r4)
        L52:
            int r5 = r1.f2610g
            float r5 = (float) r5
            float r5 = r5 * r2
            int r5 = (int) r5
            android.graphics.Rect r6 = r1.f2606c
            android.graphics.Rect r7 = r1.f2609f
            int r8 = r7.top
            int r8 = r8 + r5
            r6.top = r8
            int r7 = r7.bottom
            int r7 = r7 + r5
            r6.bottom = r7
            float r5 = r1.f2611h
            float r6 = r1.f2612i
            float r2 = p346u.C6268m.m12887a(r6, r5, r2, r5)
            r1.f2605b = r2
            android.graphics.drawable.BitmapDrawable r5 = r1.f2604a
            if (r5 == 0) goto L83
            r6 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r6
            int r2 = (int) r2
            r5.setAlpha(r2)
            android.graphics.drawable.BitmapDrawable r2 = r1.f2604a
            android.graphics.Rect r5 = r1.f2606c
            r2.setBounds(r5)
        L83:
            boolean r2 = r1.f2614k
            r5 = 1
            if (r2 == 0) goto La4
            int r2 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r2 < 0) goto La4
            r1.f2615l = r5
            androidx.mediarouter.app.OverlayListView$a$a r2 = r1.f2616m
            if (r2 == 0) goto La4
            androidx.mediarouter.app.d r2 = (androidx.mediarouter.app.C0484d) r2
            androidx.mediarouter.app.g r3 = r2.f2665b
            java.util.Set<f1.o$i> r3 = r3.f2673D0
            f1.o$i r4 = r2.f2664a
            r3.remove(r4)
            androidx.mediarouter.app.g r2 = r2.f2665b
            androidx.mediarouter.app.g$m r2 = r2.f2729z0
            r2.notifyDataSetChanged()
        La4:
            boolean r1 = r1.f2615l
            r1 = r1 ^ r5
        La7:
            if (r1 != 0) goto L11
            r0.remove()
            goto L11
        Lae:
            return
    }
}
