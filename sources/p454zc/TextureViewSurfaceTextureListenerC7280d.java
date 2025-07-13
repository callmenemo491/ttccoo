package p454zc;

/* renamed from: zc.d */
/* loaded from: classes.dex */
public class TextureViewSurfaceTextureListenerC7280d implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: Y */
    public final /* synthetic */ com.journeyapps.barcodescanner.C1253a f27933Y;

    public TextureViewSurfaceTextureListenerC7280d(com.journeyapps.barcodescanner.C1253a r1) {
            r0 = this;
            r0.f27933Y = r1
            r0.<init>()
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r2, int r3, int r4) {
            r1 = this;
            com.journeyapps.barcodescanner.a r2 = r1.f27933Y
            zc.r r0 = new zc.r
            r0.<init>(r3, r4)
            r2.f6700p0 = r0
            r2.m3701g()
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r2, int r3, int r4) {
            r1 = this;
            com.journeyapps.barcodescanner.a r2 = r1.f27933Y
            zc.r r0 = new zc.r
            r0.<init>(r3, r4)
            r2.f6700p0 = r0
            r2.m3701g()
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
            r0 = this;
            return
    }
}
