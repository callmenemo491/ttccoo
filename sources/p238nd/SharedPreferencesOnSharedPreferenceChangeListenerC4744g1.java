package p238nd;

/* renamed from: nd.g1 */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4744g1 implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ p419xh.InterfaceC7078f f19024a;

    /* renamed from: b */
    public final /* synthetic */ android.content.SharedPreferences f19025b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC4744g1(java.lang.String r1, p419xh.InterfaceC7078f r2, android.content.SharedPreferences r3, java.lang.Object r4) {
            r0 = this;
            r0.f19024a = r2
            r0.f19025b = r3
            r0.<init>()
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r4 = "showNFTPlayerValue"
            boolean r5 = p214m2.C4339q.m9702c(r4, r5)
            if (r5 == 0) goto Lc4
            xh.f r5 = r3.f19024a
            android.content.SharedPreferences r0 = r3.f19025b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L1a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = r0.getString(r4, r1)
            goto L8b
        L1a:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L2d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r4 = r0.getInt(r4, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L90
        L2d:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L40
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            long r0 = r0.getLong(r4, r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L90
        L40:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L51
            boolean r1 = r1.booleanValue()
            boolean r4 = r0.getBoolean(r4, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L92
        L51:
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L64
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r4 = r0.getFloat(r4, r1)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L90
        L64:
            boolean r2 = r1 instanceof java.util.Set
            if (r2 == 0) goto L70
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>"
            java.util.Objects.requireNonNull(r1, r2)
            java.util.Set r1 = (java.util.Set) r1
            goto L87
        L70:
            if (r2 == 0) goto L79
            boolean r2 = r1 instanceof p259oh.InterfaceC5277a
            if (r2 == 0) goto L77
            goto L79
        L77:
            r2 = 1
            goto L7a
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto Lab
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>"
            java.util.Objects.requireNonNull(r1, r2)
            boolean r2 = r1 instanceof p259oh.InterfaceC5277a
            if (r2 != 0) goto La4
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.ClassCastException -> L99
        L87:
            java.util.Set r4 = r0.getStringSet(r4, r1)
        L8b:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            java.util.Objects.requireNonNull(r4, r0)
        L90:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L92:
            p214m2.C4339q.m9704i(r4)
            r5.setValue(r4)
            goto Lc4
        L99:
            r4 = move-exception
            java.lang.Class<nh.t> r5 = p239nh.C4840t.class
            java.lang.String r5 = r5.getName()
            p214m2.C4339q.m9710t(r4, r5)
            throw r4
        La4:
            java.lang.String r4 = "kotlin.collections.MutableSet"
            p239nh.C4840t.m10857c(r1, r4)
            r4 = 0
            throw r4
        Lab:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "generic type not handle "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lc4:
            return
    }
}
