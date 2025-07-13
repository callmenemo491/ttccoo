package p085f1;

import p085f1.InterfaceC1981v;

/* renamed from: f1.w */
/* loaded from: classes.dex */
public class C1982w<T extends p085f1.InterfaceC1981v> extends android.media.MediaRouter.Callback {

    /* renamed from: a */
    public final T f8764a;

    public C1982w(T r1) {
            r0 = this;
            r0.<init>()
            r0.f8764a = r1
            return
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteAdded(android.media.MediaRouter r1, android.media.MediaRouter.RouteInfo r2) {
            r0 = this;
            T extends f1.v r1 = r0.f8764a
            r1.mo4953h(r2)
            return
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteChanged(android.media.MediaRouter r1, android.media.MediaRouter.RouteInfo r2) {
            r0 = this;
            T extends f1.v r1 = r0.f8764a
            r1.mo4948c(r2)
            return
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteGrouped(android.media.MediaRouter r1, android.media.MediaRouter.RouteInfo r2, android.media.MediaRouter.RouteGroup r3, int r4) {
            r0 = this;
            T extends f1.v r1 = r0.f8764a
            r1.mo4951f(r2, r3, r4)
            return
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteRemoved(android.media.MediaRouter r1, android.media.MediaRouter.RouteInfo r2) {
            r0 = this;
            T extends f1.v r1 = r0.f8764a
            r1.mo4952g(r2)
            return
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteSelected(android.media.MediaRouter r1, int r2, android.media.MediaRouter.RouteInfo r3) {
            r0 = this;
            T extends f1.v r1 = r0.f8764a
            r1.mo4956k(r2, r3)
            return
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteUngrouped(android.media.MediaRouter r1, android.media.MediaRouter.RouteInfo r2, android.media.MediaRouter.RouteGroup r3) {
            r0 = this;
            T extends f1.v r1 = r0.f8764a
            r1.mo4947b(r2, r3)
            return
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteUnselected(android.media.MediaRouter r1, int r2, android.media.MediaRouter.RouteInfo r3) {
            r0 = this;
            T extends f1.v r1 = r0.f8764a
            r1.mo4949d(r2, r3)
            return
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteVolumeChanged(android.media.MediaRouter r1, android.media.MediaRouter.RouteInfo r2) {
            r0 = this;
            T extends f1.v r1 = r0.f8764a
            r1.mo4955j(r2)
            return
    }
}
