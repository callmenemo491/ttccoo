package p341t9;

/* renamed from: t9.b */
/* loaded from: classes.dex */
public final class C6198b {

    /* renamed from: a */
    public static final java.util.Set<java.lang.String> f24145a = null;

    /* renamed from: b */
    public static final java.util.List<java.lang.String> f24146b = null;

    /* renamed from: c */
    public static final java.util.List<java.lang.String> f24147c = null;

    /* renamed from: d */
    public static final java.util.List<java.lang.String> f24148d = null;

    /* renamed from: e */
    public static final java.util.List<java.lang.String> f24149e = null;

    /* renamed from: f */
    public static final java.util.List<java.lang.String> f24150f = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "_in"
            java.lang.String r2 = "_xa"
            java.lang.String r3 = "_xu"
            java.lang.String r4 = "_aq"
            java.lang.String r5 = "_aa"
            java.lang.String r6 = "_ai"
            java.lang.String r7 = "_ac"
            java.lang.String r8 = "campaign_details"
            java.lang.String r9 = "_ug"
            java.lang.String r10 = "_iapx"
            java.lang.String r11 = "_exp_set"
            java.lang.String r12 = "_exp_clear"
            java.lang.String r13 = "_exp_activate"
            java.lang.String r14 = "_exp_timeout"
            java.lang.String r15 = "_exp_expire"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            p341t9.C6198b.f24145a = r0
            java.lang.String r2 = "_e"
            java.lang.String r3 = "_f"
            java.lang.String r4 = "_iap"
            java.lang.String r5 = "_s"
            java.lang.String r6 = "_au"
            java.lang.String r7 = "_ui"
            java.lang.String r8 = "_cd"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = java.util.Arrays.asList(r0)
            p341t9.C6198b.f24146b = r0
            java.lang.String r0 = "auto"
            java.lang.String r1 = "app"
            java.lang.String r2 = "am"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            p341t9.C6198b.f24147c = r0
            java.lang.String r0 = "_r"
            java.lang.String r1 = "_dbg"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            p341t9.C6198b.f24148d = r0
            r0 = 2
            java.lang.String[][] r1 = new java.lang.String[r0][]
            java.lang.String[] r2 = p249o7.C5082q4.f19963a
            r3 = 0
            r1[r3] = r2
            java.lang.String[] r2 = p249o7.C5082q4.f19964b
            r4 = 1
            r1[r4] = r2
            r2 = 0
            r5 = 0
        L72:
            if (r2 >= r0) goto L7b
            r6 = r1[r2]
            int r6 = r6.length
            int r5 = r5 + r6
            int r2 = r2 + 1
            goto L72
        L7b:
            r2 = r1[r3]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            r5 = r1[r3]
            int r5 = r5.length
        L84:
            if (r4 >= r0) goto L91
            r6 = r1[r4]
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r3, r2, r5, r7)
            int r6 = r6.length
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L84
        L91:
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.List r0 = java.util.Arrays.asList(r2)
            p341t9.C6198b.f24149e = r0
            java.lang.String r0 = "^_ltv_[A-Z]{3}$"
            java.lang.String r1 = "^_cc[1-5]{1}$"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            p341t9.C6198b.f24150f = r0
            return
    }

    /* renamed from: a */
    public static boolean m12804a(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
            java.lang.String r0 = "_cmp"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto La
            return r0
        La:
            boolean r5 = m12806c(r4)
            r1 = 0
            if (r5 != 0) goto L12
            return r1
        L12:
            if (r6 != 0) goto L15
            return r1
        L15:
            java.util.List<java.lang.String> r5 = p341t9.C6198b.f24148d
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L1b
            return r1
        L2e:
            int r5 = r4.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r5 == r2) goto L57
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r5 == r2) goto L4d
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r5 == r2) goto L43
            goto L61
        L43:
            java.lang.String r5 = "fiam"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            r4 = 2
            goto L62
        L4d:
            java.lang.String r5 = "fdl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            r4 = 1
            goto L62
        L57:
            java.lang.String r5 = "fcm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            r4 = 0
            goto L62
        L61:
            r4 = -1
        L62:
            java.lang.String r5 = "_cis"
            if (r4 == 0) goto L74
            if (r4 == r0) goto L71
            if (r4 == r3) goto L6b
            return r1
        L6b:
            java.lang.String r4 = "fiam_integration"
        L6d:
            r6.putString(r5, r4)
            return r0
        L71:
            java.lang.String r4 = "fdl_integration"
            goto L6d
        L74:
            java.lang.String r4 = "fcm_integration"
            goto L6d
    }

    /* renamed from: b */
    public static boolean m12805b(java.lang.String r2, android.os.Bundle r3) {
            java.util.List<java.lang.String> r0 = p341t9.C6198b.f24146b
            boolean r2 = r0.contains(r2)
            r0 = 0
            if (r2 == 0) goto La
            return r0
        La:
            if (r3 == 0) goto L25
            java.util.List<java.lang.String> r2 = p341t9.C6198b.f24148d
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L12
            return r0
        L25:
            r2 = 1
            return r2
    }

    /* renamed from: c */
    public static boolean m12806c(java.lang.String r1) {
            java.util.List<java.lang.String> r0 = p341t9.C6198b.f24147c
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    /* renamed from: d */
    public static boolean m12807d(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "_ce1"
            boolean r0 = r0.equals(r5)
            java.lang.String r1 = "fcm"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L51
            java.lang.String r0 = "_ce2"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L15
            goto L51
        L15:
            java.lang.String r0 = "_ln"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L2e
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L2d
            java.lang.String r5 = "fiam"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2c
            goto L2d
        L2c:
            return r3
        L2d:
            return r2
        L2e:
            java.util.List<java.lang.String> r4 = p341t9.C6198b.f24149e
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L37
            return r3
        L37:
            java.util.List<java.lang.String> r4 = p341t9.C6198b.f24150f
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.matches(r0)
            if (r0 == 0) goto L3d
            return r3
        L50:
            return r2
        L51:
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L61
            java.lang.String r5 = "frc"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L60
            goto L61
        L60:
            return r3
        L61:
            return r2
    }
}
