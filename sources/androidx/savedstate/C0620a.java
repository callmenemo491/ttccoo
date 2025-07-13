package androidx.savedstate;

@android.annotation.SuppressLint({"RestrictedApi"})
/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C0620a {

    /* renamed from: a */
    public p226n.C4640b<java.lang.String, androidx.savedstate.C0620a.b> f3678a;

    /* renamed from: b */
    public android.os.Bundle f3679b;

    /* renamed from: c */
    public boolean f3680c;

    /* renamed from: d */
    public androidx.savedstate.Recreator.C0619a f3681d;

    /* renamed from: e */
    public boolean f3682e;

    /* renamed from: androidx.savedstate.a$a */
    public interface a {
        /* renamed from: a */
        void mo1424a(androidx.savedstate.InterfaceC0622c r1);
    }

    /* renamed from: androidx.savedstate.a$b */
    public interface b {
        /* renamed from: a */
        android.os.Bundle mo1350a();
    }

    public C0620a() {
            r1 = this;
            r1.<init>()
            n.b r0 = new n.b
            r0.<init>()
            r1.f3678a = r0
            r0 = 1
            r1.f3682e = r0
            return
    }

    /* renamed from: a */
    public android.os.Bundle m2153a(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.f3680c
            if (r0 == 0) goto L1e
            android.os.Bundle r0 = r3.f3679b
            r1 = 0
            if (r0 == 0) goto L1d
            android.os.Bundle r0 = r0.getBundle(r4)
            android.os.Bundle r2 = r3.f3679b
            r2.remove(r4)
            android.os.Bundle r4 = r3.f3679b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L1c
            r3.f3679b = r1
        L1c:
            return r0
        L1d:
            return r1
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: b */
    public void m2154b(java.lang.String r2, androidx.savedstate.C0620a.b r3) {
            r1 = this;
            n.b<java.lang.String, androidx.savedstate.a$b> r0 = r1.f3678a
            java.lang.Object r2 = r0.mo10455i(r2, r3)
            androidx.savedstate.a$b r2 = (androidx.savedstate.C0620a.b) r2
            if (r2 != 0) goto Lb
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "SavedStateProvider with the given key is already registered"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: c */
    public void m2155c(java.lang.Class<? extends androidx.savedstate.C0620a.a> r4) {
            r3 = this;
            boolean r0 = r3.f3682e
            if (r0 == 0) goto L3e
            androidx.savedstate.Recreator$a r0 = r3.f3681d
            if (r0 != 0) goto Lf
            androidx.savedstate.Recreator$a r0 = new androidx.savedstate.Recreator$a
            r0.<init>(r3)
            r3.f3681d = r0
        Lf:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L21
            r4.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L21
            androidx.savedstate.Recreator$a r0 = r3.f3681d
            java.lang.String r4 = r4.getName()
            java.util.Set<java.lang.String> r0 = r0.f3676a
            r0.add(r4)
            return
        L21:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Class"
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r4 = " must have default constructor in order to be automatically recreated"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
        L3e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            r4.<init>(r0)
            throw r4
    }
}
