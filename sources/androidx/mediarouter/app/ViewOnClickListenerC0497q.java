package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.q */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0497q implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ androidx.mediarouter.app.MediaRouteExpandCollapseButton f2888Y;

    public ViewOnClickListenerC0497q(androidx.mediarouter.app.MediaRouteExpandCollapseButton r1) {
            r0 = this;
            r0.f2888Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r0 = r2.f2888Y
            boolean r1 = r0.f2596g0
            r1 = r1 ^ 1
            r0.f2596g0 = r1
            if (r1 == 0) goto L1b
            android.graphics.drawable.AnimationDrawable r1 = r0.f2592c0
            r0.setImageDrawable(r1)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r0 = r2.f2888Y
            android.graphics.drawable.AnimationDrawable r0 = r0.f2592c0
            r0.start()
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r0 = r2.f2888Y
            java.lang.String r1 = r0.f2595f0
            goto L2b
        L1b:
            android.graphics.drawable.AnimationDrawable r1 = r0.f2593d0
            r0.setImageDrawable(r1)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r0 = r2.f2888Y
            android.graphics.drawable.AnimationDrawable r0 = r0.f2593d0
            r0.start()
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r0 = r2.f2888Y
            java.lang.String r1 = r0.f2594e0
        L2b:
            r0.setContentDescription(r1)
            androidx.mediarouter.app.MediaRouteExpandCollapseButton r0 = r2.f2888Y
            android.view.View$OnClickListener r0 = r0.f2597h0
            if (r0 == 0) goto L37
            r0.onClick(r3)
        L37:
            return
    }
}
