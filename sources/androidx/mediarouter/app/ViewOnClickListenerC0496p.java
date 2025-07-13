package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.p */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0496p implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ androidx.mediarouter.app.DialogC0495o.h.c f2887Y;

    public ViewOnClickListenerC0496p(androidx.mediarouter.app.DialogC0495o.h.c r1) {
            r0 = this;
            r0.f2887Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r4) {
            r3 = this;
            androidx.mediarouter.app.o$h$c r4 = r3.f2887Y
            androidx.mediarouter.app.o$h r0 = r4.f2861A
            androidx.mediarouter.app.o r0 = r0.f2856m
            f1.o r0 = r0.f2807a0
            f1.o$i r4 = r4.f2867z
            java.util.Objects.requireNonNull(r0)
            p085f1.C1974o.m5025b()
            f1.o$e r0 = p085f1.C1974o.f8670d
            f1.i$e r1 = r0.f8698r
            boolean r1 = r1 instanceof p085f1.AbstractC1966i.b
            if (r1 == 0) goto L54
            f1.o$i r1 = r0.f8697q
            f1.o$i$a r1 = r1.m5063b(r4)
            r2 = 0
            if (r1 == 0) goto L3d
            f1.i$b$b r1 = r1.f8755a
            if (r1 == 0) goto L2b
            boolean r1 = r1.f8633e
            if (r1 == 0) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 != 0) goto L2f
            goto L3d
        L2f:
            f1.i$e r0 = r0.f8698r
            f1.i$b r0 = (p085f1.AbstractC1966i.b) r0
            java.lang.String r4 = r4.f8734b
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r0.mo4875o(r4)
            goto L44
        L3d:
            java.lang.String r4 = "MediaRouter"
            java.lang.String r0 = "Ignoring attempt to transfer to a non-transferable route."
            android.util.Log.w(r4, r0)
        L44:
            androidx.mediarouter.app.o$h$c r4 = r3.f2887Y
            android.widget.ImageView r4 = r4.f2863v
            r0 = 4
            r4.setVisibility(r0)
            androidx.mediarouter.app.o$h$c r4 = r3.f2887Y
            android.widget.ProgressBar r4 = r4.f2864w
            r4.setVisibility(r2)
            return
        L54:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "There is no currently selected dynamic group route."
            r4.<init>(r0)
            throw r4
    }
}
