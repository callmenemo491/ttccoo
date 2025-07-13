package com.google.android.material.tabs;

/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes.dex */
public class C1206a {
    public C1206a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static android.graphics.RectF m3537a(com.google.android.material.tabs.TabLayout r3, android.view.View r4) {
            if (r4 != 0) goto L8
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            return r3
        L8:
            boolean r3 = r3.f6266B0
            if (r3 != 0) goto L54
            boolean r3 = r4 instanceof com.google.android.material.tabs.TabLayout.C1204h
            if (r3 == 0) goto L54
            com.google.android.material.tabs.TabLayout$h r4 = (com.google.android.material.tabs.TabLayout.C1204h) r4
            r3 = 24
            int r0 = r4.getContentWidth()
            int r1 = r4.getContentHeight()
            android.content.Context r2 = r4.getContext()
            float r3 = p220m8.C4430n.m9884b(r2, r3)
            int r3 = (int) r3
            if (r0 >= r3) goto L28
            r0 = r3
        L28:
            int r3 = r4.getLeft()
            int r2 = r4.getRight()
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r3 = r4.getTop()
            int r4 = r4.getBottom()
            int r4 = r4 + r3
            int r4 = r4 / 2
            int r0 = r0 / 2
            int r3 = r2 - r0
            int r1 = r1 / 2
            int r1 = r4 - r1
            int r0 = r0 + r2
            int r2 = r2 / 2
            int r2 = r2 + r4
            android.graphics.RectF r4 = new android.graphics.RectF
            float r3 = (float) r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = (float) r2
            r4.<init>(r3, r1, r0, r2)
            return r4
        L54:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r3.<init>(r0, r1, r2, r4)
            return r3
    }

    /* renamed from: b */
    public void mo3538b(com.google.android.material.tabs.TabLayout r2, android.view.View r3, android.view.View r4, float r5, android.graphics.drawable.Drawable r6) {
            r1 = this;
            android.graphics.RectF r3 = m3537a(r2, r3)
            android.graphics.RectF r2 = m3537a(r2, r4)
            float r4 = r3.left
            int r4 = (int) r4
            float r0 = r2.left
            int r0 = (int) r0
            int r4 = p354u7.C6350a.m13004b(r4, r0, r5)
            android.graphics.Rect r0 = r6.getBounds()
            int r0 = r0.top
            float r3 = r3.right
            int r3 = (int) r3
            float r2 = r2.right
            int r2 = (int) r2
            int r2 = p354u7.C6350a.m13004b(r3, r2, r5)
            android.graphics.Rect r3 = r6.getBounds()
            int r3 = r3.bottom
            r6.setBounds(r4, r0, r2, r3)
            return
    }
}
