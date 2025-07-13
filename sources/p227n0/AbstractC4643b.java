package p227n0;

/* renamed from: n0.b */
/* loaded from: classes.dex */
public abstract class AbstractC4643b {

    /* renamed from: a */
    public final android.content.Context f18536a;

    /* renamed from: b */
    public p227n0.AbstractC4643b.a f18537b;

    /* renamed from: n0.b$a */
    public interface a {
    }

    public AbstractC4643b(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f18536a = r1
            return
    }

    /* renamed from: a */
    public boolean mo9206a() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: b */
    public boolean mo1473b() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: c */
    public abstract android.view.View mo1474c();

    /* renamed from: d */
    public android.view.View mo9208d(android.view.MenuItem r1) {
            r0 = this;
            android.view.View r1 = r0.mo1474c()
            return r1
    }

    /* renamed from: e */
    public boolean mo1475e() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: f */
    public void mo9207f(android.view.SubMenu r1) {
            r0 = this;
            return
    }

    /* renamed from: g */
    public boolean mo9209g() {
            r0 = this;
            boolean r0 = r0 instanceof androidx.mediarouter.app.MediaRouteActionProvider
            return r0
    }

    /* renamed from: h */
    public void mo9210h(p227n0.AbstractC4643b.a r3) {
            r2 = this;
            n0.b$a r0 = r2.f18537b
            if (r0 == 0) goto L23
            java.lang.String r0 = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " instance while it is still in use somewhere else?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionProvider(support)"
            android.util.Log.w(r1, r0)
        L23:
            r2.f18537b = r3
            return
    }
}
