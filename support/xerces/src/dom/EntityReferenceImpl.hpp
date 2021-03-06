#ifndef EntityReferenceImpl_HEADER_GUARD_
#define EntityReferenceImpl_HEADER_GUARD_

/*
 * The Apache Software License, Version 1.1
 * 
 * Copyright (c) 1999-2000 The Apache Software Foundation.  All rights
 * reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 * 
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 * 
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 * 
 * 4. The names "Xerces" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache\@apache.org.
 * 
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 * 
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 * 
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation, and was
 * originally based on software copyright (c) 1999, International
 * Business Machines, Inc., http://www.ibm.com .  For more information
 * on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */

/*
 * $Log: EntityReferenceImpl.hpp,v $
 * Revision 1.1.1.1  2000/04/08 04:37:50  kurien
 * XML parser for C++
 *
 *
 * Revision 1.6  2000/02/24 20:11:30  abagchi
 * Swat for removing Log from API docs
 *
 * Revision 1.5  2000/02/06 07:47:33  rahulj
 * Year 2K copyright swat.
 *
 * Revision 1.4  2000/02/04 01:49:27  aruna1
 * TreeWalker and NodeIterator changes
 *
 * Revision 1.3  2000/01/24 23:35:18  rahulj
 * Fixed the compiler warning generated under Solaris.
 * Matched the api signature in the base class NodeImpl.hpp.
 *
 * Revision 1.2  1999/12/21 07:47:07  robweir
 * Patches to support Xalan, where we need to create a
 * "special" DOM with subclassed Nodes.
 *
 * 1. Export the NodeImpl-derived classes
 * 2. Ensure that their constructors have at least protected access
 *
 * Revision 1.1.1.1  1999/11/09 01:09:10  twl
 * Initial checkin
 *
 * Revision 1.2  1999/11/08 20:44:28  rahul
 * Swat for adding in Product name and CVS comment log variable.
 *
 */

//
//  This file is part of the internal implementation of the C++ XML DOM.
//  It should NOT be included or used directly by application programs.
//
//  Applications should include the file <dom/DOM.hpp> for the entire
//  DOM API, or DOM_*.hpp for individual DOM classes, where the class
//  name is substituded for the *.
//

#include <util/XML4CDefs.hpp>
#include "NodeImpl.hpp"

class CDOM_EXPORT EntityReferenceImpl: public NodeImpl
{
private:
    int entityChanges;
    
public:
    EntityReferenceImpl(DocumentImpl *ownerDoc, const DOMString &entityName);
    EntityReferenceImpl(const EntityReferenceImpl &other, bool deep=false);
    virtual ~EntityReferenceImpl();
    virtual NodeImpl * cloneNode(bool deep);
    virtual NodeListImpl *getChildNodes();
    virtual NodeImpl *getFirstChild();
    virtual NodeImpl *getLastChild();
    virtual unsigned int getLength();
    virtual bool hasChildNodes();
    virtual bool isEntityReference();
    virtual NodeImpl *item(unsigned int index);
    virtual void setNodeValue(const DOMString &);
    virtual void setReadOnly(bool readOnly,bool deep);
    virtual void synchronize();
};

#endif

