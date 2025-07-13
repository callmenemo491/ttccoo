package androidx.activity.result;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public java.util.Random f618a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Integer, java.lang.String> f619b;

    /* renamed from: c */
    public final java.util.Map<java.lang.String, java.lang.Integer> f620c;

    /* renamed from: d */
    public final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.C0192d> f621d;

    /* renamed from: e */
    public java.util.ArrayList<java.lang.String> f622e;

    /* renamed from: f */
    public final transient java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.C0191c<?>> f623f;

    /* renamed from: g */
    public final java.util.Map<java.lang.String, java.lang.Object> f624g;

    /* renamed from: h */
    public final android.os.Bundle f625h;


    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    public class C0189a<I> extends androidx.activity.result.AbstractC0195c<I> {

        /* renamed from: a */
        public final /* synthetic */ java.lang.String f630a;

        /* renamed from: b */
        public final /* synthetic */ int f631b;

        /* renamed from: c */
        public final /* synthetic */ p045d.AbstractC1255a f632c;

        /* renamed from: d */
        public final /* synthetic */ androidx.activity.result.ActivityResultRegistry f633d;

        public C0189a(androidx.activity.result.ActivityResultRegistry r1, java.lang.String r2, int r3, p045d.AbstractC1255a r4) {
                r0 = this;
                r0.f633d = r1
                r0.f630a = r2
                r0.f631b = r3
                r0.f632c = r4
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.AbstractC0195c
        /* renamed from: a */
        public void mo446a(I r4, p030c0.C0816c r5) {
                r3 = this;
                androidx.activity.result.ActivityResultRegistry r0 = r3.f633d
                java.util.ArrayList<java.lang.String> r0 = r0.f622e
                java.lang.String r1 = r3.f630a
                r0.add(r1)
                androidx.activity.result.ActivityResultRegistry r0 = r3.f633d
                int r1 = r3.f631b
                d.a r2 = r3.f632c
                r0.mo436b(r1, r2, r4, r5)
                return
        }

        @Override // androidx.activity.result.AbstractC0195c
        /* renamed from: b */
        public void mo447b() {
                r2 = this;
                androidx.activity.result.ActivityResultRegistry r0 = r2.f633d
                java.lang.String r1 = r2.f630a
                r0.m445f(r1)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    public class C0190b<I> extends androidx.activity.result.AbstractC0195c<I> {

        /* renamed from: a */
        public final /* synthetic */ java.lang.String f634a;

        /* renamed from: b */
        public final /* synthetic */ int f635b;

        /* renamed from: c */
        public final /* synthetic */ p045d.AbstractC1255a f636c;

        /* renamed from: d */
        public final /* synthetic */ androidx.activity.result.ActivityResultRegistry f637d;

        public C0190b(androidx.activity.result.ActivityResultRegistry r1, java.lang.String r2, int r3, p045d.AbstractC1255a r4) {
                r0 = this;
                r0.f637d = r1
                r0.f634a = r2
                r0.f635b = r3
                r0.f636c = r4
                r0.<init>()
                return
        }

        @Override // androidx.activity.result.AbstractC0195c
        /* renamed from: a */
        public void mo446a(I r4, p030c0.C0816c r5) {
                r3 = this;
                androidx.activity.result.ActivityResultRegistry r0 = r3.f637d
                java.util.ArrayList<java.lang.String> r0 = r0.f622e
                java.lang.String r1 = r3.f634a
                r0.add(r1)
                androidx.activity.result.ActivityResultRegistry r0 = r3.f637d
                int r1 = r3.f635b
                d.a r2 = r3.f636c
                r0.mo436b(r1, r2, r4, r5)
                return
        }

        @Override // androidx.activity.result.AbstractC0195c
        /* renamed from: b */
        public void mo447b() {
                r2 = this;
                androidx.activity.result.ActivityResultRegistry r0 = r2.f637d
                java.lang.String r1 = r2.f634a
                r0.m445f(r1)
                return
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    public static class C0191c<O> {

        /* renamed from: a */
        public final androidx.activity.result.InterfaceC0194b<O> f638a;

        /* renamed from: b */
        public final p045d.AbstractC1255a<?, O> f639b;

        public C0191c(androidx.activity.result.InterfaceC0194b<O> r1, p045d.AbstractC1255a<?, O> r2) {
                r0 = this;
                r0.<init>()
                r0.f638a = r1
                r0.f639b = r2
                return
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    public static class C0192d {

        /* renamed from: a */
        public final androidx.lifecycle.AbstractC0458o f640a;

        /* renamed from: b */
        public final java.util.ArrayList<androidx.lifecycle.InterfaceC0468t> f641b;

        public C0192d(androidx.lifecycle.AbstractC0458o r1) {
                r0 = this;
                r0.<init>()
                r0.f640a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f641b = r1
                return
        }
    }

    public ActivityResultRegistry() {
            r1 = this;
            r1.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.f618a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f619b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f620c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f621d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f622e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f623f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f624g = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f625h = r0
            return
    }

    /* renamed from: a */
    public final boolean m441a(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.f619b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.ArrayList<java.lang.String> r0 = r2.f622e
            r0.remove(r3)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>> r0 = r2.f623f
            java.lang.Object r0 = r0.get(r3)
            androidx.activity.result.ActivityResultRegistry$c r0 = (androidx.activity.result.ActivityResultRegistry.C0191c) r0
            if (r0 == 0) goto L2d
            androidx.activity.result.b<O> r1 = r0.f638a
            if (r1 == 0) goto L2d
            d.a<?, O> r3 = r0.f639b
            java.lang.Object r3 = r3.mo1199c(r4, r5)
            r1.mo448d(r3)
            goto L3c
        L2d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f624g
            r0.remove(r3)
            android.os.Bundle r0 = r2.f625h
            androidx.activity.result.a r1 = new androidx.activity.result.a
            r1.<init>(r4, r5)
            r0.putParcelable(r3, r1)
        L3c:
            r3 = 1
            return r3
    }

    /* renamed from: b */
    public abstract <I, O> void mo436b(int r1, p045d.AbstractC1255a<I, O> r2, @android.annotation.SuppressLint({"UnknownNullness"}) I r3, p030c0.C0816c r4);

    /* renamed from: c */
    public final <I, O> androidx.activity.result.AbstractC0195c<I> m442c(java.lang.String r4, androidx.lifecycle.InterfaceC0471v r5, p045d.AbstractC1255a<I, O> r6, androidx.activity.result.InterfaceC0194b<O> r7) {
            r3 = this;
            r0 = r5
            androidx.fragment.app.n r0 = (androidx.fragment.app.ComponentCallbacksC0395n) r0
            androidx.lifecycle.w r0 = r0.f2269L0
            androidx.lifecycle.o$c r1 = r0.f2564c
            androidx.lifecycle.o$c r2 = androidx.lifecycle.AbstractC0458o.c.f2549b0
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 != 0) goto L41
            int r5 = r3.m444e(r4)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$d> r1 = r3.f621d
            java.lang.Object r1 = r1.get(r4)
            androidx.activity.result.ActivityResultRegistry$d r1 = (androidx.activity.result.ActivityResultRegistry.C0192d) r1
            if (r1 != 0) goto L27
            androidx.activity.result.ActivityResultRegistry$d r1 = new androidx.activity.result.ActivityResultRegistry$d
            r1.<init>(r0)
        L27:
            androidx.activity.result.ActivityResultRegistry$1 r0 = new androidx.activity.result.ActivityResultRegistry$1
            r0.<init>(r3, r4, r7, r6)
            androidx.lifecycle.o r7 = r1.f640a
            r7.mo1454a(r0)
            java.util.ArrayList<androidx.lifecycle.t> r7 = r1.f641b
            r7.add(r0)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$d> r7 = r3.f621d
            r7.put(r4, r1)
            androidx.activity.result.ActivityResultRegistry$a r7 = new androidx.activity.result.ActivityResultRegistry$a
            r7.<init>(r3, r4, r5, r6)
            return r7
        L41:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "LifecycleOwner "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " is attempting to register while current state is "
            r6.append(r5)
            androidx.lifecycle.o$c r5 = r0.f2564c
            r6.append(r5)
            java.lang.String r5 = ". LifecycleOwners must call register before they are STARTED."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    /* renamed from: d */
    public final <I, O> androidx.activity.result.AbstractC0195c<I> m443d(java.lang.String r4, p045d.AbstractC1255a<I, O> r5, androidx.activity.result.InterfaceC0194b<O> r6) {
            r3 = this;
            int r0 = r3.m444e(r4)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>> r1 = r3.f623f
            androidx.activity.result.ActivityResultRegistry$c r2 = new androidx.activity.result.ActivityResultRegistry$c
            r2.<init>(r6, r5)
            r1.put(r4, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f624g
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L24
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f624g
            java.lang.Object r1 = r1.get(r4)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.f624g
            r2.remove(r4)
            r6.mo448d(r1)
        L24:
            android.os.Bundle r1 = r3.f625h
            android.os.Parcelable r1 = r1.getParcelable(r4)
            androidx.activity.result.a r1 = (androidx.activity.result.C0193a) r1
            if (r1 == 0) goto L3e
            android.os.Bundle r2 = r3.f625h
            r2.remove(r4)
            int r2 = r1.f642Y
            android.content.Intent r1 = r1.f643Z
            java.lang.Object r1 = r5.mo1199c(r2, r1)
            r6.mo448d(r1)
        L3e:
            androidx.activity.result.ActivityResultRegistry$b r6 = new androidx.activity.result.ActivityResultRegistry$b
            r6.<init>(r3, r4, r0, r5)
            return r6
    }

    /* renamed from: e */
    public final int m444e(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.f620c
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r6 = r0.intValue()
            return r6
        Lf:
            java.util.Random r0 = r5.f618a
            r1 = 2147418112(0x7fff0000, float:NaN)
            int r0 = r0.nextInt(r1)
            r2 = 65536(0x10000, float:9.1835E-41)
        L19:
            int r0 = r0 + r2
            java.util.Map<java.lang.Integer, java.lang.String> r3 = r5.f619b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L2d
            java.util.Random r0 = r5.f618a
            int r0 = r0.nextInt(r1)
            goto L19
        L2d:
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r5.f619b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r5.f620c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r2)
            return r0
    }

    /* renamed from: f */
    public final void m445f(java.lang.String r6) {
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.f622e
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L17
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.f620c
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L17
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r5.f619b
            r1.remove(r0)
        L17:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>> r0 = r5.f623f
            r0.remove(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f624g
            boolean r0 = r0.containsKey(r6)
            java.lang.String r1 = ": "
            java.lang.String r2 = "Dropping pending result for request "
            java.lang.String r3 = "ActivityResultRegistry"
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = androidx.activity.result.C0196d.m449a(r2, r6, r1)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.f624g
            java.lang.Object r4 = r4.get(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f624g
            r0.remove(r6)
        L43:
            android.os.Bundle r0 = r5.f625h
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L64
            java.lang.StringBuilder r0 = androidx.activity.result.C0196d.m449a(r2, r6, r1)
            android.os.Bundle r1 = r5.f625h
            android.os.Parcelable r1 = r1.getParcelable(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            android.os.Bundle r0 = r5.f625h
            r0.remove(r6)
        L64:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$d> r0 = r5.f621d
            java.lang.Object r0 = r0.get(r6)
            androidx.activity.result.ActivityResultRegistry$d r0 = (androidx.activity.result.ActivityResultRegistry.C0192d) r0
            if (r0 == 0) goto L90
            java.util.ArrayList<androidx.lifecycle.t> r1 = r0.f641b
            java.util.Iterator r1 = r1.iterator()
        L74:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            androidx.lifecycle.t r2 = (androidx.lifecycle.InterfaceC0468t) r2
            androidx.lifecycle.o r3 = r0.f640a
            r3.mo1455b(r2)
            goto L74
        L86:
            java.util.ArrayList<androidx.lifecycle.t> r0 = r0.f641b
            r0.clear()
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$d> r0 = r5.f621d
            r0.remove(r6)
        L90:
            return
    }
}
