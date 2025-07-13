package com.eclipsesource.p043v8.debug.mirror;

/* loaded from: classes.dex */
public class ObjectMirror extends com.eclipsesource.p043v8.debug.mirror.ValueMirror {
    private static final java.lang.String PROPERTIES = "properties";
    private static final java.lang.String PROPERTY_NAMES = "propertyNames";

    public enum PropertyKind extends java.lang.Enum<com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind> {
        private static final /* synthetic */ com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind[] $VALUES = null;
        public static final com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind Indexed = null;
        public static final com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind Named = null;
        public int index;

        static {
                com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind r0 = new com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind
                java.lang.String r1 = "Named"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind.Named = r0
                com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind r1 = new com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind
                java.lang.String r4 = "Indexed"
                r5 = 2
                r1.<init>(r4, r3, r5)
                com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind.Indexed = r1
                com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind[] r4 = new com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind[r5]
                r4[r2] = r0
                r4[r3] = r1
                com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind.$VALUES = r4
                return
        }

        PropertyKind(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.index = r3
                return
        }

        public static com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind valueOf(java.lang.String r1) {
                java.lang.Class<com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind> r0 = com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind r1 = (com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind) r1
                return r1
        }

        public static com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind[] values() {
                com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind[] r0 = com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind.$VALUES
                java.lang.Object r0 = r0.clone()
                com.eclipsesource.v8.debug.mirror.ObjectMirror$PropertyKind[] r0 = (com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind[]) r0
                return r0
        }
    }

    public ObjectMirror(com.eclipsesource.p043v8.V8Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.eclipsesource.p043v8.debug.mirror.PropertiesArray getProperties(com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind r3, int r4) {
            r2 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r2.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            int r3 = r3.index
            r0.push(r3)
            r0.push(r4)
            r3 = 0
            com.eclipsesource.v8.V8Object r4 = r2.v8Object     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "properties"
            com.eclipsesource.v8.V8Array r3 = r4.executeArrayFunction(r1, r0)     // Catch: java.lang.Throwable -> L30
            com.eclipsesource.v8.debug.mirror.PropertiesArray r4 = new com.eclipsesource.v8.debug.mirror.PropertiesArray     // Catch: java.lang.Throwable -> L30
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L30
            r0.close()
            if (r3 == 0) goto L2f
            boolean r0 = r3.isReleased()
            if (r0 != 0) goto L2f
            r3.close()
        L2f:
            return r4
        L30:
            r4 = move-exception
            r0.close()
            if (r3 == 0) goto L3f
            boolean r0 = r3.isReleased()
            if (r0 != 0) goto L3f
            r3.close()
        L3f:
            throw r4
    }

    public java.lang.String[] getPropertyNames(com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind r5, int r6) {
            r4 = this;
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8Object r1 = r4.v8Object
            com.eclipsesource.v8.V8 r1 = r1.getRuntime()
            r0.<init>(r1)
            int r5 = r5.index
            r0.push(r5)
            r0.push(r6)
            r5 = 0
            com.eclipsesource.v8.V8Object r6 = r4.v8Object     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "propertyNames"
            com.eclipsesource.v8.V8Array r5 = r6.executeArrayFunction(r1, r0)     // Catch: java.lang.Throwable -> L35
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L35
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L35
            r2 = 0
        L23:
            if (r2 >= r6) goto L2e
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L35
            r1[r2] = r3     // Catch: java.lang.Throwable -> L35
            int r2 = r2 + 1
            goto L23
        L2e:
            r0.close()
            r5.close()
            return r1
        L35:
            r6 = move-exception
            r0.close()
            if (r5 == 0) goto L3e
            r5.close()
        L3e:
            throw r6
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public boolean isObject() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.eclipsesource.p043v8.debug.mirror.Mirror
    public java.lang.String toString() {
            r1 = this;
            com.eclipsesource.v8.V8Object r0 = r1.v8Object
            java.lang.String r0 = r0.toString()
            return r0
    }
}
