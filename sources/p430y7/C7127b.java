package p430y7;

/* renamed from: y7.b */
/* loaded from: classes.dex */
public class C7127b extends com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1187a {

    /* renamed from: a */
    public final /* synthetic */ int f27536a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f27537b;

    /* renamed from: y7.b$a */
    public class a extends com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1187a {

        /* renamed from: a */
        public final /* synthetic */ p430y7.C7127b f27538a;

        public a(p430y7.C7127b r1) {
                r0 = this;
                r0.f27538a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1187a
        /* renamed from: b */
        public void mo3469b(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                y7.b r1 = r0.f27538a
                com.google.android.material.bottomappbar.BottomAppBar r1 = r1.f27537b
                com.google.android.material.bottomappbar.BottomAppBar.m3270w(r1)
                return
        }
    }

    public C7127b(com.google.android.material.bottomappbar.BottomAppBar r1, int r2) {
            r0 = this;
            r0.f27537b = r1
            r0.f27536a = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1187a
    /* renamed from: a */
    public void mo3468a(com.google.android.material.floatingactionbutton.FloatingActionButton r3) {
            r2 = this;
            com.google.android.material.bottomappbar.BottomAppBar r0 = r2.f27537b
            int r1 = r2.f27536a
            float r0 = r0.m3271A(r1)
            r3.setTranslationX(r0)
            y7.b$a r0 = new y7.b$a
            r0.<init>(r2)
            r1 = 1
            r3.m3461m(r0, r1)
            return
    }
}
