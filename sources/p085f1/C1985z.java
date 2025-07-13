package p085f1;

import p085f1.InterfaceC1984y;

/* renamed from: f1.z */
/* loaded from: classes.dex */
public class C1985z<T extends p085f1.InterfaceC1984y> extends android.media.MediaRouter.VolumeCallback {

    /* renamed from: a */
    public final T f8765a;

    public C1985z(T r1) {
            r0 = this;
            r0.<init>()
            r0.f8765a = r1
            return
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public void onVolumeSetRequest(android.media.MediaRouter.RouteInfo r2, int r3) {
            r1 = this;
            T extends f1.y r0 = r1.f8765a
            r0.mo4954i(r2, r3)
            return
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo r2, int r3) {
            r1 = this;
            T extends f1.y r0 = r1.f8765a
            r0.mo4950e(r2, r3)
            return
    }
}
