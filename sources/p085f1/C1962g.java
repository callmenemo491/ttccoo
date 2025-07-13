package p085f1;

/* renamed from: f1.g */
/* loaded from: classes.dex */
public final class C1962g {

    /* renamed from: a */
    public final android.os.Bundle f8591a;

    /* renamed from: b */
    public java.util.List<java.lang.String> f8592b;

    /* renamed from: c */
    public java.util.List<android.content.IntentFilter> f8593c;

    /* renamed from: f1.g$a */
    public static final class a {

        /* renamed from: a */
        public final android.os.Bundle f8594a;

        /* renamed from: b */
        public java.util.ArrayList<java.lang.String> f8595b;

        /* renamed from: c */
        public java.util.ArrayList<android.content.IntentFilter> f8596c;

        public a(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r2.f8594a = r0
                java.lang.String r1 = "id"
                r0.putString(r1, r3)
                java.lang.String r3 = "name"
                r0.putString(r3, r4)
                return
        }

        /* renamed from: a */
        public p085f1.C1962g.a m4920a(java.util.Collection<android.content.IntentFilter> r3) {
                r2 = this;
                if (r3 == 0) goto L3c
                boolean r0 = r3.isEmpty()
                if (r0 != 0) goto L3b
                java.util.Iterator r3 = r3.iterator()
            Lc:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r3.next()
                android.content.IntentFilter r0 = (android.content.IntentFilter) r0
                if (r0 == 0) goto L33
                java.util.ArrayList<android.content.IntentFilter> r1 = r2.f8596c
                if (r1 != 0) goto L25
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.f8596c = r1
            L25:
                java.util.ArrayList<android.content.IntentFilter> r1 = r2.f8596c
                boolean r1 = r1.contains(r0)
                if (r1 != 0) goto Lc
                java.util.ArrayList<android.content.IntentFilter> r1 = r2.f8596c
                r1.add(r0)
                goto Lc
            L33:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "filter must not be null"
                r3.<init>(r0)
                throw r3
            L3b:
                return r2
            L3c:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "filters must not be null"
                r3.<init>(r0)
                throw r3
        }

        @android.annotation.SuppressLint({"UnknownNullness"})
        /* renamed from: b */
        public p085f1.C1962g m4921b() {
                r3 = this;
                java.util.ArrayList<android.content.IntentFilter> r0 = r3.f8596c
                if (r0 == 0) goto Lb
                android.os.Bundle r1 = r3.f8594a
                java.lang.String r2 = "controlFilters"
                r1.putParcelableArrayList(r2, r0)
            Lb:
                java.util.ArrayList<java.lang.String> r0 = r3.f8595b
                if (r0 == 0) goto L16
                android.os.Bundle r1 = r3.f8594a
                java.lang.String r2 = "groupMemberIds"
                r1.putStringArrayList(r2, r0)
            L16:
                f1.g r0 = new f1.g
                android.os.Bundle r1 = r3.f8594a
                r0.<init>(r1)
                return r0
        }

        /* renamed from: c */
        public p085f1.C1962g.a m4922c(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.f8594a
                java.lang.String r1 = "connectionState"
                r0.putInt(r1, r3)
                return r2
        }

        /* renamed from: d */
        public p085f1.C1962g.a m4923d(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.f8594a
                java.lang.String r1 = "playbackType"
                r0.putInt(r1, r3)
                return r2
        }

        /* renamed from: e */
        public p085f1.C1962g.a m4924e(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.f8594a
                java.lang.String r1 = "volume"
                r0.putInt(r1, r3)
                return r2
        }

        /* renamed from: f */
        public p085f1.C1962g.a m4925f(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.f8594a
                java.lang.String r1 = "volumeHandling"
                r0.putInt(r1, r3)
                return r2
        }

        /* renamed from: g */
        public p085f1.C1962g.a m4926g(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.f8594a
                java.lang.String r1 = "volumeMax"
                r0.putInt(r1, r3)
                return r2
        }
    }

    public C1962g(android.os.Bundle r1) {
            r0 = this;
            r0.<init>()
            r0.f8591a = r1
            return
    }

    /* renamed from: b */
    public static p085f1.C1962g m4902b(android.os.Bundle r1) {
            if (r1 == 0) goto L8
            f1.g r0 = new f1.g
            r0.<init>(r1)
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* renamed from: a */
    public void m4903a() {
            r2 = this;
            java.util.List<android.content.IntentFilter> r0 = r2.f8593c
            if (r0 != 0) goto L16
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "controlFilters"
            java.util.ArrayList r0 = r0.getParcelableArrayList(r1)
            r2.f8593c = r0
            if (r0 != 0) goto L16
            java.util.List r0 = java.util.Collections.emptyList()
            r2.f8593c = r0
        L16:
            return
    }

    /* renamed from: c */
    public int m4904c() {
            r3 = this;
            android.os.Bundle r0 = r3.f8591a
            java.lang.String r1 = "connectionState"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    /* renamed from: d */
    public java.lang.String m4905d() {
            r2 = this;
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "status"
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    /* renamed from: e */
    public int m4906e() {
            r2 = this;
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "deviceType"
            int r0 = r0.getInt(r1)
            return r0
    }

    /* renamed from: f */
    public android.os.Bundle m4907f() {
            r2 = this;
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "extras"
            android.os.Bundle r0 = r0.getBundle(r1)
            return r0
    }

    /* renamed from: g */
    public java.util.List<java.lang.String> m4908g() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.f8592b
            if (r0 != 0) goto L16
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "groupMemberIds"
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            r2.f8592b = r0
            if (r0 != 0) goto L16
            java.util.List r0 = java.util.Collections.emptyList()
            r2.f8592b = r0
        L16:
            java.util.List<java.lang.String> r0 = r2.f8592b
            return r0
    }

    /* renamed from: h */
    public android.net.Uri m4909h() {
            r2 = this;
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "iconUri"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto Lc
            r0 = 0
            goto L10
        Lc:
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L10:
            return r0
    }

    /* renamed from: i */
    public java.lang.String m4910i() {
            r2 = this;
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    /* renamed from: j */
    public java.lang.String m4911j() {
            r2 = this;
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "name"
            java.lang.String r0 = r0.getString(r1)
            return r0
    }

    /* renamed from: k */
    public int m4912k() {
            r3 = this;
            android.os.Bundle r0 = r3.f8591a
            java.lang.String r1 = "playbackStream"
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    /* renamed from: l */
    public int m4913l() {
            r3 = this;
            android.os.Bundle r0 = r3.f8591a
            java.lang.String r1 = "playbackType"
            r2 = 1
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    /* renamed from: m */
    public int m4914m() {
            r3 = this;
            android.os.Bundle r0 = r3.f8591a
            java.lang.String r1 = "presentationDisplayId"
            r2 = -1
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    /* renamed from: n */
    public int m4915n() {
            r2 = this;
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "volume"
            int r0 = r0.getInt(r1)
            return r0
    }

    /* renamed from: o */
    public int m4916o() {
            r3 = this;
            android.os.Bundle r0 = r3.f8591a
            java.lang.String r1 = "volumeHandling"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    /* renamed from: p */
    public int m4917p() {
            r2 = this;
            android.os.Bundle r0 = r2.f8591a
            java.lang.String r1 = "volumeMax"
            int r0 = r0.getInt(r1)
            return r0
    }

    /* renamed from: q */
    public boolean m4918q() {
            r3 = this;
            android.os.Bundle r0 = r3.f8591a
            java.lang.String r1 = "enabled"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    /* renamed from: r */
    public boolean m4919r() {
            r2 = this;
            r2.m4903a()
            java.lang.String r0 = r2.m4910i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = r2.m4911j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            java.util.List<android.content.IntentFilter> r0 = r2.f8593c
            r1 = 0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 1
            return r0
        L23:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "MediaRouteDescriptor{ "
            java.lang.String r1 = "id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r1)
            java.lang.String r1 = r4.m4910i()
            r0.append(r1)
            java.lang.String r1 = ", groupMemberIds="
            r0.append(r1)
            java.util.List r1 = r4.m4908g()
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r4.m4911j()
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r4.m4905d()
            r0.append(r1)
            java.lang.String r1 = ", iconUri="
            r0.append(r1)
            android.net.Uri r1 = r4.m4909h()
            r0.append(r1)
            java.lang.String r1 = ", isEnabled="
            r0.append(r1)
            boolean r1 = r4.m4918q()
            r0.append(r1)
            java.lang.String r1 = ", connectionState="
            r0.append(r1)
            int r1 = r4.m4904c()
            r0.append(r1)
            java.lang.String r1 = ", controlFilters="
            r0.append(r1)
            r4.m4903a()
            java.util.List<android.content.IntentFilter> r1 = r4.f8593c
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", playbackType="
            r0.append(r1)
            int r1 = r4.m4913l()
            r0.append(r1)
            java.lang.String r1 = ", playbackStream="
            r0.append(r1)
            int r1 = r4.m4912k()
            r0.append(r1)
            java.lang.String r1 = ", deviceType="
            r0.append(r1)
            int r1 = r4.m4906e()
            r0.append(r1)
            java.lang.String r1 = ", volume="
            r0.append(r1)
            int r1 = r4.m4915n()
            r0.append(r1)
            java.lang.String r1 = ", volumeMax="
            r0.append(r1)
            int r1 = r4.m4917p()
            r0.append(r1)
            java.lang.String r1 = ", volumeHandling="
            r0.append(r1)
            int r1 = r4.m4916o()
            r0.append(r1)
            java.lang.String r1 = ", presentationDisplayId="
            r0.append(r1)
            int r1 = r4.m4914m()
            r0.append(r1)
            java.lang.String r1 = ", extras="
            r0.append(r1)
            android.os.Bundle r1 = r4.m4907f()
            r0.append(r1)
            java.lang.String r1 = ", isValid="
            r0.append(r1)
            boolean r1 = r4.m4919r()
            r0.append(r1)
            java.lang.String r1 = ", minClientVersion="
            r0.append(r1)
            android.os.Bundle r1 = r4.f8591a
            r2 = 1
            java.lang.String r3 = "minClientVersion"
            int r1 = r1.getInt(r3, r2)
            r0.append(r1)
            java.lang.String r1 = ", maxClientVersion="
            r0.append(r1)
            android.os.Bundle r1 = r4.f8591a
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r3 = "maxClientVersion"
            int r1 = r1.getInt(r3, r2)
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
